package com.study.collectionstudy

/**
 * 矩阵转置
 */
object TransposeDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Traversable 集合 t，它有三个元素，每个元素都是 Traversable 集合，并分别存储以下数据
    val t = Traversable(Traversable(2, 4, -1), Traversable(-10, 5, 11), Traversable(18, -7, 6))
    // 2    4   -1
    // -10  5   11
    // 18   -7   6
    // 通过 transpose 方法对集合 t 进行转置操作
    val result = t.transpose
    // result = List(List(2, -10, 18), List(4, 5, -7), List(-1, 11, 6))
    println(s"result = ${result}")
  }
}
