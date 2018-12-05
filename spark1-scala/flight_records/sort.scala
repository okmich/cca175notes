//Load data from HDFS and store results back to HDFS using Spark
//Problem formulation
//=============================
//Read the /user/cloudera/rawdata/flight_dataset/flight_depart_sum_delay 
//save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/flight_depart_sum_sorted
//for each carrier. All records should be sorted by avg departure in descending order
//the output file should contain the delimited fields carrier name,  sum_departInMin

val contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/flight_depart_sum_delay")
val fieldsRDD = contentRDD.map(l => l.split("\t")).map(ks => (ks(0), ks(1).toInt))

//sort by the second value of the tuple in descending order
val sortedRDD = fieldsRDD.sortBy(a => -a._2)
//output presentation
val outputRDD = sortedRDD.map(v => v._1 + "\t" + v._2)
outputRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/flight_depart_sum_sorted")
