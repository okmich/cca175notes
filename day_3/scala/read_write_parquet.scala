//Load data from HDFS and store results back to HDFS using Spark
//Problem formulation
//=============================
//Read the /user/cloudera/rawdata/flight_dataset/carrier/carriers.csv file from hdfs,
//convert all records in the file to a tab-delimited format and save back to hdfs at 
///user/cloudera/rawdata/flight_dataset/scala_out/carrier_tabbed.
//Also remove all quotes in each field as well as the header
val contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/carrier")
//removing header
val filteredRDD = contentRDD.filter(l => !l.startsWith("Code"))
//remove quotes
val qremovedRDD = filteredRDD.map(l => l.replace("\"",""))
//split by comma and separate by tab
val splittedRDD = qremovedRDD.map(l => l.split(",")).map(a => (a(0), a(1))) 
//sort the ouput by the word
val sortedRDD = splittedRDD.sortBy(a => a._1)
//save output 
sortedRDD.toDF("code","name").write.parquet("/user/cloudera/rawdata/flight_dataset/scala_out/carrier_pq")
