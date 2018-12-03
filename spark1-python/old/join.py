#Load data from HDFS and store results back to HDFS using Spark
#Problem formulation
#=============================
#Read the /user/cloudera/rawdata/flight_dataset/flight 
#and /user/cloudera/rawdata/flight_dataset/carrier_tabbed file from hdfs,
#save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/py_out/flight_carrier_name
#for each carrier 
#the output file should contain the delimited fields flightnum, carrier name
contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/flight")
#map each line and filter by the second field of each line after split
filteredContentRDD = contentRDD.filter(lambda l: not l.startswith("Year"))
fieldsRDD = contentRDD.map(lambda l:  l.split(",")).map(lambda fs: (fs[8], fs[9]))

#prepare carrier data
carrierContentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/carrier_tabbed")
#map each line and filter by the second field of each line after split
carrierFieldsRDD = carrierContentRDD.map(lambda l: l.split("\t")).map(lambda ks: (ks[0], ks[1]))

#join both fieldsRDD
joinedRDD = fieldsRDD.join(carrierFieldsRDD) #(key, (fs[9], ks[1]))
#output presentation
outputRDD = joinedRDD.map(lambda v: v[1][0] + "\t" + v[1][1])

outputRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/py_out/flight_carrier_name")