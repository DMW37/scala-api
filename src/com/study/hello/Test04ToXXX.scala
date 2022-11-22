package com.study.hello

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object Test04ToXXX {
  def main(args: Array[String]): Unit = {
    // 自动类型转换:和java一样
    // 强制类型转换
    /**
     * val|var 变量名 = 值.toXxx // 例如强转为 Int 则为 toInt
     */
    val a: Double = 3.14
    val b: Int = a.toInt
    println(b)

    // 字符串转换
    /**
     * val|var 变量名 = 数值类型 + ""
     * val|var 变量名 = 数值类型.toString
     */
    val a1 = 10
    val b1 = 3.14
    val c1 = true
    // 通过字符串拼接的形式转换
   // val a2 = a1 + ""
    val b2 = b1 + ""
    val c2 = c1 + ""
    // 通过 toString 函数实现
   // val a3 = a1.toString
    val b3 = b1.toString
    val c3 = c1.toString

    /**
     * val|var 变量名 = 数值类型.toXxx // 例如强转为 Int 则为 toInt
     */
    val s1 = "2"
    val s2 = "3.14"
    val s3 = "true"
   // val a1 = s1.toInt
    val a2 = s2.toDouble
    val a3 = s3.toBoolean
  }
}
