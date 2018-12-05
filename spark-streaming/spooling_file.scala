
import org.apache.spark.streaming._
import org.apache.spark.streaming.StreamingContext._


val ssc = new StreamingContext(sc, Seconds(1))

val lines = ssc.textFileStream("/user/cloudera/rawdata/filestreamdir")

//add code to do word count
val result = lines.flatMap(_.split(" ")).map(w => (w,1)).reduceByKey((a, b) => a+b)


ssc.start()             
ssc.awaitTermination()  