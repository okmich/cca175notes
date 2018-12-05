//Load data from HDFS and store results back to HDFS using Spark
//Problem formulation
//=============================
//Read the /user/cloudera/rawdata/flight_dataset/flight 
//and /user/cloudera/rawdata/flight_dataset/carrier_tabbed file from hdfs,
//save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/flight_carrier_name
//for each carrier 
//the output file should contain the delimited fields flightnum, carrier name
val contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/flight")
//map each line and filter by the second field of each line after split
val filteredContentRDD = contentRDD.filter(l => !l.startsWith("Year"))
val fieldsRDD = contentRDD.map(l => l.split(",")).map(fs => (fs(8), fs(9)))

//prepare carrier data
val carrierContentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/carrier_tabbed")
//map each line and filter by the second field of each line after split
val carrierFieldsRDD = carrierContentRDD.map(l => l.split("\t")).map(ks => (ks(0), ks(1)))

//join both fieldsRDD
val joinedRDD = fieldsRDD.join(carrierFieldsRDD) //(key, (fs(9), ks(1)))
//output presentation
val outputRDD = joinedRDD.map(v => v._2._1 + "\t" + v._2._2)

outputRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/flight_carrier_name")