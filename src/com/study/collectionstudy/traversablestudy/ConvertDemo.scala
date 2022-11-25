package com.study.collectionstudy.traversablestudy

/**
 * 类型转换
 */
object ConvertDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Traversable 集合，包含 1, 2, 3, 4, 5, 6
    val t = (1 to 6).toTraversable
    // 将集合分别转成数组、列表、集这三种形式，并打印结果
    println(t.toArray) // [I@7e0babb1
    println(t.toList) // List(1, 2, 3, 4, 5, 6)
    println(t.toSet) // Set(5, 1, 6, 2, 3, 4)
    println(t.toSeq)
  }
}
