package com.study.collectionstudy

/**
* 获取元素
*/
object GetElementDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Traversable 集合，包含 1, 2, 3, 4, 5, 6
    val t = Traversable(1, 2, 3, 4, 5, 6)
    // 分别通过 head、last、headOption、lastOption 获取集合中的首尾元素
    println(t.head)
    println(t.last)
    println(t.headOption.getOrElse(0))
    println(t.lastOption.getOrElse(0))
    // 通过 find 方法获取集合中第一个偶数
    val result1 = t.find(x => x % 2 == 0)
    println(s"result1 = ${result1}")
    // 简化版
    val result2 = t.find(_ % 2 == 0)
    println(s"result2 = ${result2}")
    // 通过 slice 方法获取 3, 4, 5 并将它们放到一个新的 Traversable 集合
    val result3 = t.slice(2, 5) // 左闭右开
    println(s"result3 = ${result3}")
 }
}
