package com.study.functionalexpression

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object ReduceDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，包含以下元素：1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val list = (1 to 10).toList
    // 使用 reduce 计算所有元素的和
    val result1 = list.reduce((x, y) => x + y)
    println(s"result1 = ${result1}")

    // 简写方式
    // 第一个下划线相当于 x，第二个下划线相当于 y
    val result2 = list.reduce(_ + _)
    println(s"result2 = ${result2}")


    // 使用 reduceLeft 计算所有元素的和
    val result3 = list.reduceLeft(_ + _)
    println(s"result3 = ${result3}")

    // 使用 reduceRight 计算所有元素的和
    val result4 = list.reduceRight(_ + _)
    println(s"result4 = ${result4}")


    // 以上程序 reduce 和 reduceLeft 和 reduceRight 的结果都是一样的
    // 如果做相减操作的话那结果就不一样了（reduce 和 reduceLeft 还是一样的）
    println(list.reduce(_ - _))
    println(list.reduceLeft(_ - _))
    println(list.reduceRight(_ - _))

    val groupRe = Map("Hello" -> List(("Hello", 1), ("Hello", 1), ("Hello", 1), ("Hello", 1)))
    val result5: Map[String, Int] = groupRe.map(kv => kv._2.reduce((wn1, wn2) => wn1._1 -> (wn1._2 + wn2._2)))
    println(result5)

    val listx = List(("Hello", 1), ("Hello", 1), ("Hello", 1), ("Hello", 1))
    val result6 = listx.reduce(
      (w1, w2) => w1._1 -> (w1._2 + w2._2)
    )

    println(result6)


  }
}
