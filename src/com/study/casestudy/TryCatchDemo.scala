package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object TryCatchDemo {
  def main(args: Array[String]): Unit = {
    try {
      // 可能会出现问题的代码
      val result = 10 / 0;
      println("Hello World!")
    } catch {
      // 异常处理
      case e: ArithmeticException => println("算数异常")
      case e: NullPointerException => println("空指针异常")
      // 将异常类型，异常描述信息，以及异常出现的位置打印到控制台
      case e: Exception => e.printStackTrace()
    } finally {
      // 清理工作，不管是否出现异常都会执行
      println("清理工作，不管是否出现异常都会执行")
    }
    println("后续代码")
    throw new RuntimeException("我是一个运行时异常")
    println("后续代码")
  }

}
