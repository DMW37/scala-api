package com.study.collectionstudy.liststudy

/**
 * 扁平化操作
 */
object ListFlattenDemo {
  /**
   * 定义一个列表，该列表有三个元素，分别为： List("Hello", "World") 、 List("Hello", "Scala") 、
   * List("Hello", "Spark")
   * 使用 flatten 将这个列表转换为 List("Hello", "World", "Hello", "Scala", "Hello", "Spark")
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    val list1 = List(List("Hello", "World"), List("Hello", "Scala"), List("Hello", "Spark"))
    val list2 = list1.flatten
    println(s"list1: ${list1}")
    println(s"list2: ${list2}")
  }
}
