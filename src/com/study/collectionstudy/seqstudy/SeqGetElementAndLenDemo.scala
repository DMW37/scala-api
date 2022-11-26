package com.study.collectionstudy.seqstudy

/**
* 获取元素与长度
*/
object SeqGetElementAndLenDemo {
  def main(args: Array[String]): Unit = {
    // 创建 Seq 集合，存储元素 1, 2, 3, 4, 5
    val s = (1 to 5).toSeq
    // 打印集合元素
    s.foreach(x => println(x))
    // 简化版
    s.foreach(println(_))
    s.foreach(println)
    // 打印集合长度
    println(s.size)
    // 获取索引为 2 的元素
    // 通过集合名(索引)的方式获取
    println(s(2))
    // 通过集合伴生对象的 apply 方法获取
    println(s.apply(2))
 }
}
