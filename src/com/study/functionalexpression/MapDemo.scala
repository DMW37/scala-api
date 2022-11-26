package com.study.functionalexpression

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    // 将列表中的每个数乘以 2
    // 完整版
    val result1 = list.map((x: Int) => {
      x * 2
    })
    println(result1)
    // 使用类型推断简化函数定义
    val result2 = list.map(x => x * 2)
    println(result2)
    // 使用下划线简化函数定义
    val result3 = list.map(_ * 2)
    println(result3)
  }
}
