package com.study.collectionstudy.setstudy

/**
 * 案例演示
 */
object SetDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.immutable.ListSet
    import scala.collection.mutable
    // 创建 HashSet 集合，存储元素 1, 4, 3, 2, 5，然后打印集合
    val hs = mutable.HashSet(1, 4, 3, 2, 5, 5)
    println(hs) // 唯一、无序 Set(1, 5, 2, 3, 4)
    // 创建 ListSet 集合，存储 1, 4, 3, 2, 5，然后打印集合
    val ls = ListSet(1, 4, 3, 2, 5, 5)
    println(ls) // 唯一、有序 ListSet(1, 4, 3, 2, 5)
    // 创建 TreeSet 集合，存储元素 1, 4, 3, 2, 5, 5，然后打印集合
    val ts = mutable.TreeSet(1, 4, 3, 2, 5, 5)
    println(ts) // 唯一、排序 TreeSet(1, 2, 3, 4, 5)
  }
}
