package com.study.casestudy

/**
* 匹配 Option
*/
object OptionDemo {
  def division(a: Int, b: Int): Option[Int] = {
    // 定义一个两个数相除的方法，使用 Option 类型来封装结果
    if (b == 0) { // 当除数为零时，打印异常信息
      None
   } else { // 当除数不为零时，打印相除结果
      Some(a / b)
   }
 }
  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 0
    val result = division(a, b)
    // 配合模式匹配返回友好提示
    result match {
      case Some(x) => println(s"${a} / ${b} = ${result}")
      case None => println("对不起，除数不能为零")
   }
    // 配合 Option 的 isEmpty 方法来检测元素是否为 None
    println(result.isEmpty)
    // 配合 getOrElse 方法返回友好提示
    println(result.getOrElse("对不起，除数不能为零"))
 }
}
