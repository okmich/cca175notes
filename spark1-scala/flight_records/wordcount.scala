val wordsFromFileRDD = sc.textFile("file:///opt/sample-data/pg4300.txt")
//val wordRDD = wordsFromFileRDD.flatMap(l => l.split(" "))
//val outputRDD = wordRDD.countByValue

val wordRDD = wordsFromFileRDD.flatMap(l => l.split(" "))
val mappedWordRDD = wordRDD.map(w => (w,1))
//reduce the word by counting occurence of unique word
val reducedWordRDD = mappedWordRDD.reduceByKey((a, b) => a+b)
//we now want to tab delimit the fields of the output
val outputRDD = reducedWordRDD.map(x => x._1 + "\t" + x._2)
//sort the result by the word
val sortecRDD = outputRDD.sortBy(a => a)
//write as textFile, sequencefile
sortecRDD.saveAsTextFile("/user/cloudera/output/pg4300_tab")


sortecRDD.map(l => ("", l)).saveAsSequenceFile("/user/cloudera/output/pg4300_tab_seq")