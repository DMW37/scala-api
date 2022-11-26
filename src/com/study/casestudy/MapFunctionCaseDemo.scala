package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object MapFunctionCaseDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，包含 1-10 的数字
    val list = (1 to 10).toList
    val result = list.map {
      // 请将 1-3 的数字都转换为 [1-3]
      case x if x >= 1 && x <= 3 => "[1-3]"
      // 请将 4-8 的数字都转换为 [4-8]
      case x if x >= 4 && x <= 8 => "[4-8]"
      // 将其他的数字转换为 (8-*]
      case _ => "(8-*]"
    }
    println(s"result = ${result}")

  }
}
