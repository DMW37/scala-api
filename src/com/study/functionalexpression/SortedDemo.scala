package com.study.functionalexpression

/**
* 默认排序
*/
object SortedDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，包含以下元素：3, 1, 2, 9, 7
    val list = List(3, 1, 2, 9, 7)
    // 对列表进行升序排序
    val ascList = list.sorted
    println(s"ascList = ${ascList}")
    // 对列表进行降序排序，先升序再反转
    val descList = ascList.reverse
    println(s"descList = ${descList}")
 }
}
