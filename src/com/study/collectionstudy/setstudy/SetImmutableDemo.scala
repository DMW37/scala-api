package com.study.collectionstudy.setstudy

/**
* 不可变 Set
*/
object SetImmutableDemo {
  def main(args: Array[String]): Unit = {
    val set1 = Set[Int]()
    println(set1)
    val set2 = Set(1, 1, 2, 3, 4, 5)
    println(set2)
 }
}
