package com.study.collectionstudy.tuplestudy

/**
 * 访问元组元素
 */
object TupleEachDemo {
  def main(args: Array[String]): Unit = {
    val tuple = ("张三", 18, "Male")
    // 访问元组中的单个元素
    println(tuple._1, tuple._2, tuple._3)
    // 遍历元组
    val iterator = tuple.productIterator
    for (elem <- iterator) println(elem)
  }
}
