package com.study.collectionstudy.iterablestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object Iterator2Demo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，包含以下元素：1, 2, 3, 4, 5
    val list = List(1, 2, 3, 4, 5)
    // 获取迭代器
    val iter = list.iterator
    // while + iterator
    while (iter.hasNext) {
      println(iter.next())
    }
    println("=" * 20, "华丽的分割线", "=" * 20)
    // for + iterator
    for (elem <- list.iterator) {
      println(elem)
    }
    println("=" * 20, "华丽的分割线", "=" * 20)
    // foreach + iterator
    list.iterator.foreach(println)

  }
}
