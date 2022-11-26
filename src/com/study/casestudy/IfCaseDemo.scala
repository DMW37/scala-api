package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object IfCaseDemo {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn
    // 提示用户输入一个数字并接收
    println("请输入一个数字")
    val a = StdIn.readInt()
    a match {
      // 如果 a >= 0 而且 a <= 3，打印 [0-3]
      case x if x >= 0 && x <= 3 => println("[0-3]")
      // 如果 a >= 4 而且 a<=8，打印 [4-8]
      case x if x >= 4 && x <= 8 => println("[4-8]")
      // 否则，打印未匹配
      case _ => println("未匹配")
    }

  }
}
