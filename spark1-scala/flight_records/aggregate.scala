import org.apache.spark.storage.StorageLevel
//Load data from HDFS and store results back to HDFS using Spark
//Problem formulation
//=============================
//Read the /user/cloudera/rawdata/flight_dataset/flight file from hdfs,
//save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/flight_depart_sum_delay
//for each carrier 
//save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/flight_depart_avg_delay
//for each carrier 
//the output file should contain the delimited fields carrier code,  avg_departInMin
val contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/flight")
//map each line and filter by the second field of each line after split
val filteredContentRDD = contentRDD.filter(l => !l.startsWith("Year"))
val fieldArrayRDD = filteredContentRDD.map(l => l.split(","))
//because some of the depDelay fields are marked as NA, we will be filtering those records out.
val fieldsRDD = fieldArrayRDD.filter(a => a(15) != "NA").map(fs => (fs(8), fs(15).toInt))

//caching
fieldsRDD.persist(StorageLevel.MEMORY_AND_DISK)

//reduce
val reduceSumRDD = fieldsRDD.reduceByKey((a,b) => a+b)
val outputSumRDD = reduceSumRDD.map(t=> t._1 + "\t" + t._2)
//saving the sum 
outputSumRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/flight_depart_sum_delay")

//combine
val combineRDD = fieldsRDD.combineByKey(
	a => (a,1),
	(a:(Int,Int), b:Int) => (a._1 + b, a._2 + 1),
	(a:(Int,Int),b:(Int,Int)) => (a._1 + b._1, a._2 + b._2))
//compute average
val valueRDD = combineRDD.map(a  => a._1 + "\t" + (a._2._1.toFloat/a._2._2)) //we converted the numerator to a float to prevent integer division
valueRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/flight_depart_avg_delay")