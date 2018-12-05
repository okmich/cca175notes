#Load data from HDFS and store results back to HDFS using Spark
#Problem formulation
#=============================
#Read the /user/cloudera/rawdata/flight_dataset/flight file from hdfs,
#save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/py_out/flight_april_only
#for all flight records for April (month - 4)
#the output file should contain the fields flight_num, date, departure, arrival
contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/flight")
#map each line and filter by the second field of each line after split
filteredContentRDD = contentRDD.filter(lambda l: not l.startswith("Year"))
fieldsRDD = filteredContentRDD.keyBy(lambda l: l.split(",")[1]) #give me the key to index this line
filteredFieldsRDD = fieldsRDD.filter(lambda t: t[0] == "4").map(lambda t: t[1])
#present output
outRDD = filteredFieldsRDD.map(lambda l: l.split(",")).map(lambda a: a[9] + "\t" + a[2]+"/"+a[1]+"/"+a[0]+ "\t" + a[16] + "\t" + a[17])

#save output
outRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/py_out/flight_april_only")