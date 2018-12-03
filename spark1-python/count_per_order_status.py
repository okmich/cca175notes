# Write a spark application that reads from the metastore table retaildb.orders.
# Calculate the number of records for each order status.
# Write the result into another table called retaildb.count_per_order_status

# create table retaildb.count_per_order_status (
# order_status string,
# order_count bigint
# )
# stored as parquet;

# read records from orders table
ordersDF = sqlContext.read.table("retaildb.orders")

#use sql to process the data
#alternative 1
resultDF = tagDF.groupBy("order_status").count

#write the result back to count_per_order_status
resultDF.write.insertInto("retaildb.count_per_order_status")