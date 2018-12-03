# From the tag table in cca_hive table, write a spark application that read the data in the table and calculate the number of tag for each movie in the entire dataset.
# Write your output into a table called movie_tag_count;

# create table cca_hive.movie_tag_count (
# 	movieId int,
# 	tag_count bigint
# 	)
# stored as parquet;

#sudo ln -s /etc/hive/conf/hive-site.xml /etc/spark/conf/

# read records from tag table
tagDF = sqlContext.read.table("cca_hive.tag")

#use sql to process the data
#alternative 1
resultDF = tagDF.groupBy("movieid").count

#alternative 2
tagDF.registerTempTable("tag_temp")
resultDF = sqlContext.sql("select movieid, count(1) from tag_temp group by movieid")

#write the result back to movie_tag_count
resultDF.write.insertInto("cca_hive.movie_tag_count")