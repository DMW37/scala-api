package com.study.collectionstudy.liststudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object List2StringDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，包含元素：1, 2, 3, 4
    val list = List(1, 2, 3, 4,"你真好")
    // 使用`toString`方法输出该列表元素
    println(list.toString())
    // 简写形式，如果输出语句打印的是对象，默认会调用该对象的 toString() 方法
    println(list)
    // 使用`mkString`方法指定分隔符为冒号，并输出该列表元素
    println(list.mkString(":---"))
  }

}
