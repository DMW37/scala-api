package com.study.functionalexpression

/**
 * 指定属性排序
 */
object SortByDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个包含了若干文本行的列表：`01 zookeeper`，`02 hadoop`，`03 hive`，`04 spark`
    val list = List("01 zookeeper", "02 hadoop", "03 hive", "04 spark")
    // 按照字母字典序进行排序 48 49 50 51
    val result1 = list.sortBy(s => s.split("\\s+")(1))
    println(s"result1 = ${result1}")
    // 简写版
    val result2 = list.sortBy(_.split("\\s+")(1))
    println(s"result2 = ${result2}")
  }
}
