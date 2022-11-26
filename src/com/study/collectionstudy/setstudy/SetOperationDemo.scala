package com.study.collectionstudy.setstudy

/**
* 常见操作
*/
object SetOperationDemo {
  def main(args: Array[String]): Unit = {
    // 创建一个集，包含以下元素：1, 1, 2, 3, 4, 5
    val set2 = Set(1, 1, 2, 3, 4, 5)
    // 获取集的长度
    println(s"长度：${set2.size}")
    // 遍历集
    println("遍历：")
    for (elem <- set2) {
      println(elem)
   }
    // 删除元素 3
    val result1 = set2 - 3
    println(s"删除元素 3：${result1}")
    // 拼接另一个集 Set(7, 8, 9)
    val result2 = set2 ++ Set(7, 8, 9)
    println(s"拼接另一个集：${result2}")
    // 拼接列表 List(10, 11, 12)
    val result3 = set2 ++ List(10, 11, 12)
    println(s"拼接列表：${result3}")
 }
}
