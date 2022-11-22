package com.study.hello

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object Test07Statement {
  def main(args: Array[String]): Unit = {
    // TODO:语句块
    /**
     * Scala 中使用 {} 表示一个语句块，语句块是有返回值的（最后一个逻辑行）
     */
    val result = {
      println("我是语句快")
      1+2
    }
    println(result)
  }
}
