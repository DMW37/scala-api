package com.study.collectionstudy.iterablestudy

/**
 * 遍历集合
 */
object IterableDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Traversable 集合，包含 1, 2, 3, 4, 5
    val t = (1 to 5).toTraversable
    // 通过 iterator() 方法遍历上述列表
    // 方式一：将 Traversable 集合转为 Iterator
    val iter1 = t.toIterator
    while (iter1.hasNext) {
      println(iter1.next())
    }
    // 方式二：将 Traversable 集合转为 List 再获取 Iterator
    val iter2 = t.toList.iterator
    while (iter2.hasNext) {
      println(iter2.next())
    }
    // 通过 foreach() 方法遍历上述列表
    t.foreach(x => println(x))
    // 简化版
    t.foreach(println(_))
    t.foreach(println)
    println("------------------")

    val t3 = (1 to 5).toTraversable
    val iter3: Iterator[Int] = t3.iterator
    while (iter3.hasNext) {
      println(iter3.next())
    }
    t.foreach(println(_))
  }
}
