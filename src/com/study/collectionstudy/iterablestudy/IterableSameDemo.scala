package com.study.collectionstudy.iterablestudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description: 判断集合是否相同
 */
object IterableSameDemo {

  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    // 定义 Iterable 集合 iter1，包含 "A", "B", "C"
    val iter1 = Iterable("A", "B", "C")
    // 通过 sameElements() 方法，判断集合 iter1 和 Iterable("A", "B", "C") 是否相同
    println(iter1.sameElements(Iterable("A", "B", "C"))) // true
    // 通过 sameElements() 方法，判断集合 iter1 和 Iterable("A", "B", "C") 是否相同
    println(iter1.sameElements(Iterable("A", "C", "B"))) // false
    // 定义 Iterable 集合 iter2，包含 "A", "B", "C", "D"
    val iter2 = Iterable("A", "B", "C", "D")
    // 通过 sameElements() 方法，判断集合 iter1 和 iter2 是否相同
    println(iter1.sameElements(iter2)) // false
    // 思考：HashSet(1, 5, 2, 3, 4) 和 TreeSet(2, 1, 4, 3, 5) 是否相同？ true
    println(mutable.HashSet(1, 5, 2, 3, 4).sameElements(mutable.TreeSet(2, 1, 4, 3, 5)))

  }
}
