package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description: 匹配列表
 */
object ListCaseDemo {
  def main(args: Array[String]): Unit = {
    // 只包含 5 一个元素的列表
    val list1 = List(5)
    // 只包含两个元素的列表
    val list2 = List(11, 22)
    // 以 5 开头的列表，长度为 3
    val list3 = List(5, 6, 7)
    // 以 5 结尾的列表，长度为 3
    val list4 = List(1, 2, 5)
    // 以 5 开头的列表，数量不固定
    val list5 = List(5, 6, 7, 8, 9)
    // 使用匹配模式，匹配上述列表
    // 方案一：通过 List() 实现
    list5 match{
      case List(5) => println("匹配列表：只包含 5 一个元素的列表")
      case List(x, y) => println(s"匹配列表：只包含两个元素的列表，分别为：${x}，${y}")
      case List(5, x, y) => println(s"匹配列表：以 5 开头的列表，长度为 3，后两个元素分别为：${x}，${y}")
      case List(x, y, 5) => println(s"匹配列表：以 5 结尾的列表，长度为 3，前两个元素分别为：${x}，${y}")
      case List(5, _*) => println("匹配列表：以 5 开头的列表，数量不固定")
      case _=>println("未匹配")
    }

    // 方案二：通过关键字实现 Nil tail
    list5 match {
      case 5 :: Nil => println("匹配列表：只包含 5 一个元素的列表")
      case x :: y :: Nil => println(s"匹配列表：只包含两个元素的列表，分别为：${x}，${y}")
      case 5 :: x :: y :: Nil => println(s"匹配列表：以 5 开头的列表，长度为 3，后两个元素分别为：${x}，${y}")
      case x :: y :: 5 :: Nil => println(s"匹配列表：以 5 结尾的列表，长度为 3，前两个元素分别为：${x}，${y}")
      case 5 :: tail => println("匹配列表：以 5 开头的列表，数量不固定")
      case _ =>println("未匹配")
    }
  }
}
