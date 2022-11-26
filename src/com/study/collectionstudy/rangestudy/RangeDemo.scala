package com.study.collectionstudy.rangestudy

object RangeDemo {
  def main(args: Array[String]): Unit = {
    // to：[]
    val range01: Range.Inclusive = 1 to 5 // 1 2 3 4 5
    // until：[)
    val range02: Range = 1 until 5 // 1 2 3 4
    // Range：[)
    //val range02: Range = Range(1, 5, 1)  // 1 2 3 4
    for (i <- range02) println(i)
    println("----------------2\n")
    // by：设置步长
    // val range03: Range = 1 to 5 by 2  // 1 3 5
    // val range03: Range = Range(1, 5, 2) // 1 3
    val range03: Range = 1 until 5 by 2 // 1 3
    for (i <- range03) println(i)
  }
}
