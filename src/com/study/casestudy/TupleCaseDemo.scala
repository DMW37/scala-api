package com.study.casestudy

/**
 * 匹配元组
 */
object TupleCaseDemo {
  def main(args: Array[String]): Unit = {
    // 以 5 开头的元组，长度为 2
    val tuple1 = (5, 6)
    // 以 5 结尾的元组，长度为 2
    val tuple2 = (1, 5)
    // 只包含两个元素的元组
    val tuple3 = (1, 2)
    // 使用匹配模式，匹配上述元组
    tuple2 match {
      case (5, x) => println(s"匹配元组：以 5 开头的元组，长度为 2，后一个元素为：${x}")
      case (x, 5) => println(s"匹配元组：以 5 结尾的元组，长度为 2，前一个元素为：${x}")
      case (x, y) => println(s"匹配元组：只包含两个元素的元组，分别为：${x}，${y}")
      case _ => println("未匹配")
    }
    // 只包含 5 一个元素的元组
    val tuple4: Any = (5)
    // 只包含三个元素的元组
    val tuple5: Any = (5, 6, 7)
    // 以 5 开头的元组，数量不固定
    val tuple6 = (5, 6, 7, 8, 9)
    val tuple2arr: Any = tuple6.productIterator.toArray
    // 使用匹配模式，匹配上述元组
    tuple2arr match {
      case (5) => println(s"匹配元组：只包含 5 一个元素的元组")
      case (x, y, z) => println(s"匹配元组：只包含三个元素的元组，分别为：${x}，${y}，${z}")
      case Array(5, _*) => println("匹配元组：以 5 开头的元组，数量不固定")
      case _ => println("未匹配")
    }
  }
}
