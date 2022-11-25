package com.study.functionstudy

object ParameterFunctionDemo {
  def main(args: Array[String]): Unit = {
    // 准备一个 1-10 的整数列表
    val list = (1 to 10).toList
    println(list)
    // 创建一个函数，用于将数字转换为指定个数的小星星
    val num2starFunc = n => "*" * n

    // 创建一个方法，用于将数字转换为指定个数的小星星
    def num2starMethod(n: Int): String = "*" * n

    // 调用 map 方法将第一步的列表转换为目标列表
    val result = list.map(num2starMethod)
    println(result)
  }
}
