package com.study.functionalexpression

/**
* 分组
*/
object GroupByDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，包含了学生的姓名和性别：`"张三" -> "男"`，`"李四" -> "女"`，`"王五" -> "男"`
    val list = List("张三" -> "男", "李四" -> "女", "王五" -> "男")
    // 按照性别进行分组
    val result1 = list.groupBy(s => s._2)
    println(s"result1 = ${result1}")
    // 简写形式
    val result2 = list.groupBy(_._2)
    println(s"result2 = ${result2}")
    // 统计不同性别学生的人数
    val count1 = result2.map(kv => kv._1 -> kv._2.size)
    println(s"count = ${count1}")
    // 因为 kv 出现了两次，所以无法优化为简写形式，因为每一个下划线代表一个参数
 }
}
