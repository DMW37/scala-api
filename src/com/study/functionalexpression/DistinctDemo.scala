package com.study.functionalexpression

object DistinctDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 2, 3, 4, 5, 6)
    // 使用 Set 去重会打乱列表元素原有的顺序
    println(list.toSet) // Set(5, 1, 6, 2, 3, 4)
    // 使用 distinct 去重不会改变列表元素原有的顺序
    println(list.distinct) // List(1, 2, 3, 4, 5, 6)
 }
}
