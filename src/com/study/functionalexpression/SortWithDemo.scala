package com.study.functionalexpression

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object SortWithDemo {
  def main(args: Array[String]): Unit = {
    val list = List(2, 3, 1, 6, 4, 5)
    // 使用 sortWith 对列表进行升序排序
    val result1 = list.sortWith((x, y) => x < y)
    println(s"result1 = ${result1}") // List(1, 2, 3, 4, 5, 6)
    // 简写形式
    // 第一个下划线相当于 x，第二个下划线相当于 y，对列表进行降序排序
    val result2 = list.sortWith(_ > _)
    println(s"result2 = ${result2}") // List(6, 5, 4, 3, 2, 1)
  }

}
