package com.study.genericsstudy

/**
* 泛型类
*/
object GenericsClassDemo {
  // 定义一个 Pair 泛型类，该类包含两个字段，且两个字段的类型不固定
  class Pair[T](var a: T, var b: T)
  case class Person(name: String, age: Int)
  def main(args: Array[String]): Unit = {
    // 创建不同类型的 Pair 泛型类对象，并打印
    val pair1 = new Pair[Int](10, 20)
    println(pair1.a, pair1.b)
    val pair2 = new Pair[Person](Person("张三", 18), Person("李四", 19))
    println(pair2.a, pair2.b)
 }
}
