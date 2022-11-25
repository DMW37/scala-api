package com.study.collectionstudy.iterablestudy

/**
 * 按索引生成元组
 */
object IterableGenerateTupleDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Iterable 集合，存储"A", "B", "C", "D", "E"
    val i = Iterable("A", "B", "C", "D", "E")
    // 通过 zipWithIndex() 方法按照`字符串 -> 索引`生成新的集合
    val result1 = i.zipWithIndex
    println(s"result1 = ${result1}")
    // 通过 map() 方法按照`索引 -> 字符串`生成新的集合
    val result2 = result1.map(x => x._2 -> x._1)
    println(s"result2} = ${result2}")
  }
}
