package com.study.casestudy

/**
 * 匹配集
 */
object SetCaseDemo {
  def main(args: Array[String]): Unit = {
    // 只包含 5 一个元素的集
    val set1 = Set(5)
    // 只包含两个元素的集
    val set2 = Set(5, 6)
    // 以 5 开头的集，长度为 3
    val set3 = Set(5, 6, 7)
    // 以 5 结尾的集，长度为 3
    val set4 = Set(1, 2, 5)
    // 以 5 开头的集，数量不固定
    val set5 = Set(5, 6, 7, 8, 9)
    // 使用匹配模式，匹配上述集
    set5.toArray match {
      case Array(5) => println("匹配数组：只包含 5 一个元素的数组")
      case Array(x, y) => println(s"匹配数组：只包含两个元素的数组，元素分别为：${x}，${y}")
      case Array(5, x, y) => println(s"匹配数组：以 5 开头的数组，长度为 3，后两个元素分别为：${x}，${y}")
      case Array(x, y, 5) => println(s"匹配数组：以 5 结尾的数组，长度为 3，前两个元素分别为：${x}，${y}")
      case Array(5, _*) => println("匹配数组：以 5 开头的数组，数量不固定")
      case _ => println("未匹配")
    }
  }
}
