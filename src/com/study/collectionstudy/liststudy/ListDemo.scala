package com.study.collectionstudy.liststudy

/**
* 不可变列表
*/
object ListDemo {
  def main(args: Array[String]): Unit = {
    // 创建一个不可变列表，存放元素
    val list1 = List(1, "2", 3.14, true, null)
    println(list1(0), list1, list1.size, list1.length)
    // 使用`Nil`创建一个不可变的空列表
    val list2 = Nil
    println(list2, list2.size)
    // 使用`::`方法创建列表，包含 -2、-1 两个元素
    val list3 = -2 :: -1 :: Nil
    println(list3.head, list3, list3.size)
 }
}
