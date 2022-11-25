package com.study.collectionstudy.traversablestudy

/**
 * 拼接集合
 */
object ConcatDemo {
  def main(args: Array[String]): Unit = {
    // 已知有三个 Traversable 集合，分别存储(11, 22, 33), (44, 55), (66, 77, 88, 99)元素
    val t1 = Traversable(11, 22, 33)
    val t2 = Traversable(44, 55)
    val t3 = Traversable(66, 77, 88, 99)
    // 通过 concat 方法拼接上述三个集合
    val result = Traversable.concat(t1, t2, t3)
    // result = List(11, 22, 33, 44, 55, 66, 77, 88, 99)
    println(s"result = ${result}")
  }
}
