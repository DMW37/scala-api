package com.study.functionalexpression

/**
 * 扁平化映射
 */
object FlatMapDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个包含了若干文本行的列表：`hello world`，`a new line`，`hello`，`the end`
    val list = List("hello world", "a new line", "the end")
    // 获取文件行中的每个单词，并将其放入新的列表中
    // 方式一：先 map 后 flatten
    val result1 = list.map(s => s.split("\\s+")).flatten
    println(s"result1 = ${result1}")
    // 简写形式
    val result2 = list.map(_.split("\\s+")).flatten
    println(s"result2 = ${result2}")
    // 方式二：使用 flatMap
    val result3 = list.flatMap(s => s.split("\\s+"))
    println(s"result3 = ${result3}")
    // 简写形式
    val result4 = list.flatMap(_.split("\\s+"))
    println(s"result4 = ${result4}")
  }
}
