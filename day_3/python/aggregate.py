#Load data from HDFS and store results back to HDFS using Spark
#Problem formulation
#=============================
#Read the /user/cloudera/rawdata/flight_dataset/flight file from hdfs,
#save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/py_out/flight_depart_sum_delay
#for each carrier 
#save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/py_out/flight_depart_avg_delay
#for each carrier 
#the output file should contain the delimited fields carrier code,  avg_departInMin
contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/flight")
#map each line and filter by the second field of each line after split
filteredContentRDD = contentRDD.filter(lambda l: not l.startswith("Year"))
fieldArrayRDD = filteredContentRDD.map(lambda l: l.split(","))
#because some of the depDelay fields are marked as NA, we will be filtering those records out.
fieldsRDD = fieldArrayRDD.filter(lambda a: a[15] != "NA").map(lambda fs: (fs[8], int(fs[15])))

#reduce  -sum
reduceSumRDD = fieldsRDD.reduceByKey(lambda a,b: a+b)
outputSumRDD = reduceSumRDD.map(lambda t: t[0] + "\t" + str(t[1]))
#saving the sum 
outputSumRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/py_out/flight_depart_sum_delay")

#combine - avg
combineRDD = fieldsRDD.combineByKey(
	(lambda v: (v,1)),
	(lambda acc, v: (acc[0] + v, acc[1] + 1)),
	(lambda acc1, acc2: (acc1[0] + acc2[0], acc1[1] + acc2[1]))) #(carrier_code, (sum, count))
#compute average
valueRDD = combineRDD.map(lambda v: v[0] + "\t" + str(float(v[1][0])/v[1][1])) #we converted the numerator to a float to prevent integer division
valueRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/py_out/flight_depart_avg_delay")
