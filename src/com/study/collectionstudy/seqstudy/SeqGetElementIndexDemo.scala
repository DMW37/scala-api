package com.study.collectionstudy.seqstudy

/**
* 获取元素索引
*/
object SeqGetElementIndexDemo {
  def main(args: Array[String]): Unit = {
    // 定义 Seq 集合，包含 1, 2, 4, 6, 4, 3, 1, 2
    val s = Seq(1, 2, 4, 6, 4, 3, 1, 2)
    // 获取元素 2 在集合中第一次出现的索引
    println(s.indexOf(2))
    // 获取元素 2 在集合中最后一次出现的索引
    println(s.lastIndexOf(2))
    // 获取集合中，小于 5 的第一个偶数的索引
    println(s.indexWhere(x => x < 5 && x % 2 == 0))
    // 获取集合中小于 5 的最后一个偶数的索引
    println(s.lastIndexWhere(x => x < 5 && x % 2 == 0))
    // 从索引 2 位置开始查找集合，查找小于 5 的第一个偶数的索引
    // 第一个参数：查找条件(匿名函数) 第二个参数：开始索引
    println(s.lastIndexWhere(x => x < 5 && x % 2 == 0, 2))
    // 获取子序列 Seq(1, 2) 在集合中第一次出现的索引
    println(s.indexOfSlice(Seq(1, 2)))
    // 从索引 3 开始查找子序列 Seq(1, 2) 在集合中第一次出现的索引
    println(s.indexOfSlice(Seq(1, 2), 3))
  }
}
