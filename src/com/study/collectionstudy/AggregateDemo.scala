package com.study.collectionstudy

/**
* 聚合操作
*/
object AggregateDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Traversable 集合，包含 1, 2, 3, 4, 5, 6
    val t = Traversable(1, 2, 3, 4, 5, 6)
    // 通过 count 方法统计集合中所有奇数的个数
    println(t.count(x => x % 2 == 1))
    // 简化版
    println(t.count(_ % 2 == 1))
    // 通过 sum 方法获取集合中所有元素的和
    println(t.sum)
    // 通过 product 方法获取集合中所有元素的乘积
    println(t.product)
    // 通过 max 方法获取集合中所有元素的最大值
    println(t.max)
    // 通过 min 方法获取集合中所有元素的最小值
    println(t.min)
 }
}
