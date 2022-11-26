package com.study.casestudy

object CollectFunctionCaseDemo {
  def main(args: Array[String]): Unit = {
    // 已知一个 List 列表，存储元素为：1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val list = (1 to 10).toList
    // 定义过滤偶数的偏函数
    val pf: PartialFunction[Int, Int] = {
      case x if x % 2 == 0 => x
   }
    // 通过 collect 函数筛选出集合中所有的偶数
    val result1 = list.collect(pf)
    println(s"result1 = ${result1}")
    // 合并版
    val result2 = list.collect {
      case x if x % 2 == 0 => x
   }
    println(s"result2 = ${result2}")
 }
}
