package com.study.casestudy

/**
* 变量声明的匹配
*/
object ValCaseDemo {
  def main(args: Array[String]): Unit = {
    // 生成包含 0-10 数字的数组
    val arr = (0 to 10).toArray
    // 使用模式匹配分别获取第二个、第三个、第四个元素
    val Array(_, x, y, z, _*) = arr
    println(x, y, z)
    // 生成包含 0-10 数字的列表
    val list = (0 to 10).toList
    // 使用模式匹配分别获取第一个、第二个元素
    // 方案一：通过 List() 实现
    val List(a, b, _*) = list
    println(a, b)
    // 方案二：通过关键字实现 Nil tail
    val c :: d :: tail = list
    println(c, d)
 }
}
