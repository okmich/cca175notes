#Load data from HDFS and store results back to HDFS using Spark
#Problem formulation
#=============================
#Read the /user/cloudera/rawdata/flight_dataset/flight_depart_sum_delay 
#save a tab-delimited text file to hdfs at /user/cloudera/rawdata/flight_dataset/py_out/flight_depart_sum_sorted
#for each carrier. All records should be sorted by avg departure in descending order
#the output file should contain the delimited fields carrier name,  sum_departInMin

contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/flight_depart_sum_delay")
fieldsRDD = contentRDD.map(lambda l: l.split("\t")).map(lambda ks: (ks[0], int(ks[1])))

#sort by the second value of the tuple in descending order
sortedRDD = fieldsRDD.sortBy(lambda a: -a[1])
#output presentation
outputRDD = sortedRDD.map(lambda v: v[0] + "\t" + str(v[1]))
outputRDD.saveAsTextFile("/user/cloudera/rawdata/flight_dataset/py_out/flight_depart_sum_sorted")

outputRDD.map(lambda l: (None,l)).saveAsSequenceFile("/user/cloudera/rawdata/flight_dataset/py_out/flight_depart_sum_sorted_seq")
