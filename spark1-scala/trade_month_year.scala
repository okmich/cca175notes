
// Given the hive table cca_hive.price_data_wide, write a spark application that will generate a report that shows the number of trades for each month of the year for each trading symbol/pair.
// The report should be stored in a table called cca_hive.trades_year_month.
// the month year should be in the format Year-Month e.g. 2012-1

// create table trades_year_month(
// 	sym string,
// 	year_month string,
// 	trade_count bigint
// )
// stored as text
// row format delimited 
// fields terminated by '|';

//read from hive table
val priceDataDF = sqlContext.read.table("cca_hive.price_data_wide")

priceDataDF.registerTempTable("p")
val aggDF = 
	sqlContext.sql("select sym, concat(year, '-', month) year_month, count(1) trade_count from p group by sym, year, month")

aggDF.write.insertInto("cca_hive.trades_year_month")


// =======================
// import org.apache.spark.sql.functions._
// val projDF = priceDataDF.select($"sym", 
// 	concat($"year", lit("-"), $"month").as("year_month"))

// val aggDF = projDF.groupBy("year_month","sym").count
// aggDF.withColumnRenamed("count", "trade_count").write.insertInto("cca_hive.trades_year_month")