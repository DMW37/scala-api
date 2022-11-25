package com.study.collectionstudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description:
 */
object TraversableDemo {
  def main(args: Array[String]): Unit = {
    // 创建空的 Traversable 对象
    var t1 = Traversable.empty[Int]

    // 方式二：通过小括号方式实现
    val t2: Iterable[Int] = Traversable[Int]()

    // 方式三：通过 Nil 实现
    val t3 = Nil

    // 比较他们是否相同 == 比较集合中的数据
    println(t1 == t2)
    println(t1 == t3)
    println(t2 == t3)


    // 创建带元素的 Traversable 对象
    // 方式一：通过 toTraversable() 方式实现
    val t4 = List(1, 2, 3).toTraversable
    val t5 = Set(1, 2, 3).toTraversable
    val t6 = Array(1, 2, 3).toTraversable

    // 方式二：通过 Traversable 的伴生对象的 apply() 方法实现
    val t7 = Traversable(1, 2, 3)

    println(t4)
    println(t5)
    println(t6)
    println(t7)

  }
}
