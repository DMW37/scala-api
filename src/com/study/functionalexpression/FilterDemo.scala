package com.study.functionalexpression

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description: 过滤
 */
object FilterDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，包含以下元素：1, 2, 3, 4, 5, 6, 7, 8, 9
    val list = (1 to 9).toList
    // 请过滤出所有的偶数
    val result1 = list.filter(x => x % 2 == 0)
    println(s"result1 = ${result1}")

    // 简写形式
    val result2 = list.filter(_ % 2 == 0)
    println(s"result2 = ${result2}")

    // 请过滤出所有的不是偶数
    val result3 = list.filterNot(_%2==0)
    println(s"result3=${result3}")
  }
}
