wordsFromFileRDD = sc.textFile("file:///opt/sample-data/pg4300.txt")

wordRDD = wordsFromFileRDD.flatMap(lambda l: l.split(" "))
mappedWordRDD = wordRDD.map(lambda w: (w,1))
#reduce the word by counting occurence of unique word
reducedWordRDD = mappedWordRDD.reduceByKey(lambda a, b: a + b)
#sort the result by the word
sortedRDD = reducedWordRDD.sortByKey()
#we now want to tab delimit the fields of the output
outputRDD = sortedRDD.map(lambda x: x[0] + "\t" + str(x[1]))
#write as textFile, sequencefile
outputRDD.saveAsTextFile("/user/cloudera/output/py_out/pg4300_tab")


outputRDD.map(lambda x: (None, x)).saveAsSequenceFile("/user/cloudera/output/py_out/pg4300_tab_seq")