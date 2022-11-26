package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object CaseClassDemo {
  case class User(name: String, age: Int)

  case class Order(id: Int)

  def main(args: Array[String]): Unit = {
    // val a: Any = User("张三", 18)
    val a: Any = Order(1)

    a match {
      case User(a, b) => println(s"User 类型的对象，name=${a}，age=${b}")
      case Order(a) => println(s"Order 类型的对象，id=${a}")
      case _ => println("未匹配")
    }
  }
}
