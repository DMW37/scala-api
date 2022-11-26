package com.study.functionalexpression

object ForeachDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    // 完整版
    list.foreach((elem: Int) => {
      println(elem)
    })
    // 简写版
    list.foreach(elem => println(elem))

    // 使用下划线简化函数定义
    list.foreach(println(_))
    list.foreach(println)
  }
}
