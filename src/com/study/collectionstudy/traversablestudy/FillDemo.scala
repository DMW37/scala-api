package com.study.collectionstudy.traversablestudy

/**
 * 填充元素
 */
object FillDemo {
  def main(args: Array[String]): Unit = {
    import scala.util.Random
    // 通过 fill 方法，生成一个 Traversable 集合，该集合包含 5 个元素，都是"abc"
    println(Traversable.fill(5)("abc")) //
    // 通过 fill 方法，生成一个 Traversable 集合，该集合包含 3 个随机数
    println(Traversable.fill(3)(Random.nextInt(100)))
    // 通过 fill 方法，生成一个 Traversable 集合，该集合包含 5 个元素，都是 都是 List("abc", "abc") 集合
    // 5 表示生成的集合中有 5 个集合元素，2 表示每个集合元素的长度为 2
    println(Traversable.fill(5, 2)("abc"))
    // 通过 iterate 方法，生成一个 Traversable 集合，该集合包含 5 个元素，分别为：1, 10, 100, 1000, 10000
    println(Traversable.iterate(1, 5)(x => x * 10))
    // 简化版
    println(Traversable.iterate(1, 5)(_ * 10))
    // 通过 range 方法，获取从数字 1 开始到数字 21 结束，间隔为 5 的所有数据
    println(Traversable.range(1, 21, 5)) // 左闭右开
  }
}
