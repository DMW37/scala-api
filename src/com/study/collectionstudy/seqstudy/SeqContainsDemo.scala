package com.study.collectionstudy.seqstudy

object SeqContainsDemo {
  def main(args: Array[String]): Unit = {
    // 定义 Seq 集合，存储 1 到 10
    val s = (1 to 10).toSeq
    // 判断集合是否以子序列 Seq(1, 2) 开头
    println(s.startsWith(Seq(1, 2)))
    // 判断集合是否以子序列 Seq(1, 3) 开头
    println(s.endsWith(Seq(1, 3)))
    // 判断集合是否以子序列 Seq(9, 10) 结尾
    println(s.endsWith(Seq(9, 10)))
    // 判断集合是否以子序列 Seq(8, 9) 结尾
    println(s.endsWith(Seq(8, 9)))
    // 判断集合是否包含元素 3
    println(s.contains(3))
    // 判断集合是否包含子序列 Seq(1, 2)
    println(s.containsSlice(Seq(1, 2)))
    // 判断集合是否包含子序列 Seq(1, 3)
    println(s.containsSlice(Seq(1, 3)))
 }
}
