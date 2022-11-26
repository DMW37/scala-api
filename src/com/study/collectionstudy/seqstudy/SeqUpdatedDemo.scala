package com.study.collectionstudy.seqstudy

/**
 * 修改元素
 */
object SeqUpdatedDemo {
  def main(args: Array[String]): Unit = {
    // 定义 Seq 集合，存储 1 到 5
    val s = (1 to 5).toSeq
    // 修改索引 2 位置的元素为 10
    val s2 = s.updated(2, 10)
    println(s"s2 = ${s2}")
    // 从索引 1 开始，用子序列 Seq(10, 20) 替换 3 个元素
    val s3 = s.patch(1, Seq(10, 20), 3)
    println(s"s3 = ${s3}")
    val s4 = s.patch(1, Seq(30, 40, 50), 4)
    println(s"s4 = ${s4}")
  }
}
