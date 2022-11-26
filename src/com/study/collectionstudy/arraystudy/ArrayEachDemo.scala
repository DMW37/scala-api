package com.study.collectionstudy.arraystudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object ArrayEachDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, "2", 3.14, true, null)
    // to
    for (i <- 0 to arr.length - 1) {
      println(s"arr(i) = ${arr(i)}")
    }
    println("=" * 20, "华丽的分割线", "=" * 20)
    // until 左闭右开
    for (i <- 0 until arr.length) {
      println(s"arr(i) = ${arr(i)}")
    }
    println("=" * 20, "华丽的分割线", "=" * 20)
    // 遍历索引
    for (i <- arr.indices) {
      println(s"arr(i) = ${arr(i)}")
    }
    println("=" * 20, "华丽的分割线", "=" * 20)
    // 遍历元素
    for (elem <- arr) {
      println(elem)
    }
    println("=" * 20, "华丽的分割线", "=" * 20)
    // foreach
    arr.foreach(x => println(x))
    arr.foreach(println)

  }

}
