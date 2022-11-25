package com.study.functionstudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description: 高级柯里化
 */
object CurryDemo02 {
  // 柯里化函数，接收三个数
  def curryNum(f: (Int, Int, Int) => Int)(n1: Int)(n2: Int)(n3: Int): Int = f(n1, n2, n3)

  def main(args: Array[String]): Unit = {
    // 普通柯里化
    // 三个数相加
    println(curryNum(_ + _ + _)(1)(2)(3))

    // 三个数相减
    println(curryNum(_ - _ - _)(3)(2)(1))

    // 高级柯里化，配合下划线"_"产生新的函数
    // 加法
    val addition = curryNum(_ + _ + _) _
    println(addition(1)(2)(3))

    // 减法
    val subtraction = curryNum(_ - _ - _) _
    println(subtraction(3)(2)(1))
  }
}
