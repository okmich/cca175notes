//Load data from HDFS and store results back to HDFS using Spark
//Problem formulation
//=============================
//Read the /user/cloudera/rawdata/flight_dataset/flight file from hdfs,
//save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/flight_april_only
//for all flight records for April (month - 4)
//the output file should contain the fields flight_num, date, departure, arrival
val contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/flight")
//map each line and filter by the second field of each line after split
val filteredContentRDD = contentRDD.filter(l => !l.startsWith("Year"))
//val fieldsRDD = contentRDD.map(l => l.split(",")).map(arr => (arr(1), arr)) //give me what you want the new line to look like
val fieldsRDD = filteredContentRDD.keyBy(l => l.split(",")(1)) //give me the key to index this line
val filteredFieldsRDD = fieldsRDD.filter(t => t._1 == "4").map(t=> t._2)
//present output
val outRDD = filteredFieldsRDD.map(l => l.split(",")).map(a => a(9) + "\t" + a(2)+"/"+a(1)+"/"+a(0)+ "\t" + a(16) + "\t" + a(17))

//save output
outRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/flight_april_only")