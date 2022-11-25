package com.study.collectionstudy.iterablestudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description:
 */
object IterableGroupedDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Iterable 集合，存储 1~13 之间的所有整数
    val iterable = (1 to 13).toIterable
    // 通过 grouped() 方法，对 Iterator 集合按照 5 个元素为一组的形式进行分组，遍历并打印结果
    val iterator = iterable.grouped(5)
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }
}
