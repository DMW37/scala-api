package com.study.functionalexpression

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object FoldDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，包含以下元素：1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val list = (1 to 10).toList
    // 使用 fold 计算所有元素的和
    val result1 = list.fold(10)((x, y) => x + y)
    println(s"result1 = ${result1}")

    // 简写方式
    val result2 = list.fold(10)(_+_)
    println(s"result2 = ${result2}")

    // 使用 reduceLeft 计算所有元素的和
    val result3 = list.foldLeft(10)(_ + _)
    println(s"result3 = ${result3}")
    // 使用 reduceRight 计算所有元素的和
    val result4 = list.foldRight(10)(_ + _)
    println(s"result4 = ${result4}")

    // 以上程序 fold 和 foldLeft 和 foldRight 的结果都是一样的
    // 如果做相减操作的话那结果就不一样了（fold 和 foldLeft 还是一样的）
    println(list.fold(10)(_ - _))
    println(list.foldLeft(100)(_ - _))
    println(list.foldRight(10)(_ - _))
  }
}
