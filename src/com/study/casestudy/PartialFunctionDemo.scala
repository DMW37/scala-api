package com.study.casestudy

object PartialFunctionDemo {
  def main(args: Array[String]): Unit = {
    // 定义偏函数
    val pf:PartialFunction[Int,String] = {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "Other"
   }
    // 调用偏函数
    println(pf(1), pf(2), pf(3), pf(4))
 }
}
