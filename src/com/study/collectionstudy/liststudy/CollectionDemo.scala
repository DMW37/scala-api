package com.study.collectionstudy.liststudy

/**
 * 并集 & 交集 & 差集
 */
object CollectionDemo {
  def main(args: Array[String]): Unit = {
    // 定义列表 list1，包含以下元素：1, 2, 3, 4
    val list1 = List(1, 2, 3, 4)
    // 定义列表 list2，包含以下元素：3, 4, 5, 6
    val list2 = List(3, 4, 5, 6)
    // 使用`union`获取 list1 和 list2 的并集
    println(s"并集：${list1.union(list2)}")
    // 在上一步的基础上，使用`distinct`去除重复的元素
    println(s"并集并去重：${list1.union(list2).distinct}")
    // 使用`intersect`获取 list1 和 list2 的交集
    println(s"交集：${list1.intersect(list2)}")
    // 使用`diff`获取列表 list1 和 list2 的差集
    println(s"差集：${list1.diff(list2)}")
  }
}
