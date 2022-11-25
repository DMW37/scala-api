package com.study.collectionstudy.traversablestudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description:
 */
object ScanDemo {
  def main(args: Array[String]): Unit = {
    // 定义 Traversable 集合 t，存储 1, 2, 3, 4, 5
    val t = Traversable(1, 2, 3, 4, 5)
    // 假设初始值为 1，通过 scan 方法分别获取 t 集合中各个元素的阶乘值
    val result1 = t.scan[Int](1)((x: Int, y: Int) => x * y)
    println(s"result1 = ${result1}")
    // 简化版
    val result2 = t.scan(1)(_ * _)
    println(s"result2 = ${result2}")
    val t2 = Traversable(1, 2, 3, 4, 5)
    // 从左往右计算
    println(t2.scan(1)((x: Int, y: Int) => x - y))
    println(t2.scanLeft(1)((x: Int, y: Int) => x - y))
    // 从右往左计算
    println(t2.scanRight(1)((x: Int, y: Int) => x - y))
  }
}
