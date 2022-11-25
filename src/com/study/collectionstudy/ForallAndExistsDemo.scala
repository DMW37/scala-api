package com.study.collectionstudy

/**
* 判断元素
*/
object ForallAndExistsDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Traversable 集合，包含 1, 2, 3, 4, 5, 6
    val t = Traversable(1, 2, 3, 4, 5, 6)
    // 通过 forall 方法判断集合中的元素是否都是偶数
    println(t.forall(x => x % 2 == 0))
    // 简化版
    println(t.forall(_ % 2 == 0))
    // 通过 exists 方法判断集合中的元素是否有偶数
    // 简化版
    println(t.exists(x => x % 2 == 0))
    // 简化版
    println(t.exists(_ % 2 == 0))
 }
}
