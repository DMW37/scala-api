package com.study.collectionstudy.tuplestudy

/**
* 元组
*/
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val tuple1 = ("张三", 18)
    println(tuple1, tuple1.productIterator.length)
    val tuple2 = "李四" -> 19
    println(tuple2, tuple1.productIterator.length)
    println(tuple1,tuple1.productIterator.length)
 }
}
