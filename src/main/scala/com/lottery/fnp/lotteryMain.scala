package com.lottery.fnp
import org.apache.spark.sql.SparkSession

object lotteryMain {
  def main(args: Array[String]): Unit = {
    System.setProperty("hadoop.home.dir", "E:/Downloads/winutils-master/winutils-master/hadoop-2.7.1")
    val spark = SparkSession
      .builder()
      .master("local")
      .appName("lotteryApp")
      .getOrCreate()
  }

}
