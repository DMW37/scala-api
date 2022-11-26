package com.study.collectionstudy.arraystudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object ArrayMethodDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(7, 5, 1, 2, 6, 8, 3, 4)
    // 求和
    println(arr.sum)
    // 求最大
    println(arr.max)
    // 求最小
    println(arr.min)
    // 排序正序
    arr.sorted.foreach(e => print(e))
    println()
    // 反转
    arr.reverse.foreach(e => print(e))
    println()
    // 排序倒序
    arr.sorted.reverse.foreach(e => print(e))
  }
}
