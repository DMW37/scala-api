package com.study.hello

import scala.io.StdIn
/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object Test05StdIn {
  def main(args: Array[String]): Unit = {
    println("请输入您的名字:")
    var name = StdIn.readLine()
    println(name)
    println("请输入您的金额:")
    var money = StdIn.readDouble()
    println(money)
  }
}
