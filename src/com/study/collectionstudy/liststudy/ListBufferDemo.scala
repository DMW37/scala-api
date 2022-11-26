package com.study.collectionstudy.liststudy

/**
* 可变列表
*/
object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ListBuffer
    val list1 = ListBuffer[Int]()
    println(list1, list1.size)
    val list2 = ListBuffer(1, "2", 3.14, true, null)
    println(list2(0), list2, list2.size)
 }
}
