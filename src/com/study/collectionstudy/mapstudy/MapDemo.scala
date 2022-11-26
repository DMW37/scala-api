package com.study.collectionstudy.mapstudy

/**
 * 案例演示
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.immutable.{ListMap, TreeMap}
    import scala.collection.mutable
    // 创建 HashMap 集合，存储元素 (1, "A"), (2, "B"), (3, "C"), (3, "D")，然后打印集合
    val hm = mutable.HashMap((1, "A"), (2, "B"), (3, "C"), (3, "D"))
    println(hm) // Key 唯一、无序 Map(2 -> B, 1 -> A, 3 -> D)
    // 创建 ListMap 集合，存储 (1, "A"), (3, "C"), (2, "B"), (3, "D")，然后打印集合
    val lm = ListMap((1, "A"), (3, "C"), (2, "B"), (3, "D"))
    println(lm) // Key 唯一、有序
    // 创建 TreeMap 集合，存储元素 (1, "A"), (3, "C"), (2, "B"), (3, "D")，然后打印集合
    val tm = TreeMap((1, "A"), (3, "C"), (2, "B"), (3, "D"))
    println(tm) // Key 唯一、排序 Map(1 -> A, 2 -> B, 3 -> D)
  }
}
