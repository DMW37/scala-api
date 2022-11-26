package com.study.casestudy

object ForeachFunctionCaseDemo {
  def main(args: Array[String]): Unit = {
    val list = List(("张三", 18), ("李四", 19), 5, "Scala", (1 to 5).toList)
    list.foreach {
      case (k, v) => println(k, v)
      case i: Int => println(s"整数：${i}")
      case s: String => println(s"字符串：${s}")
      case l: List[Int] => l.map(_ * 2).foreach(println)
   }
 }
}
