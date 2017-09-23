# Load data from HDFS and store results back to HDFS using Spark
# Problem formulation
# =============================
# Read the /user/cloudera/rawdata/flight_dataset/carrier/carriers.csv file from hdfs,
# convert all records in the file to a tab-delimited format and save back to hdfs at 
# /user/cloudera/rawdata/flight_dataset/py_out/carrier_tabbed.
# Also remove all quotes in each field as well as the header
contentRDD = sc.textFile("/user/cloudera/rawdata/flight_dataset/carrier")
# removing header
filteredRDD = contentRDD.filter(lambda l: not l.startswith("Code"))
# remove quotes
qremovedRDD = filteredRDD.map(lambda l: l.replace("\"",""))
# split by comma and separate by tab
splittedRDD = qremovedRDD.map(lambda l: l.split(",")).map(lambda a: (a[0], a[1])) 
# sort the ouput by the word
sortedRDD = splittedRDD.sortBy(lambda a: a[0])
#df = sqlContext.createDataFrame(rdd, ['name', 'age'])
# write our sortedRDD to hdfs as a text file
sqlContext.createDataFrame(sortedRDD, ['code', 'name']).write.parquet("/user/cloudera/rawdata/flight_dataset/py_out/carrier_pq")
