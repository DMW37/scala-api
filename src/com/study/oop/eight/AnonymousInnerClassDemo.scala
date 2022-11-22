package com.study.oop.eight

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object AnonymousInnerClassDemo {
  abstract class Hello {
    def sayHello(): Unit
  }

  abstract class Hi {
    def sayHi(str: String): Unit
  }

  def show(h: Hello): Unit = h.sayHello()

  def show(h: Hi): Unit = h.sayHi("Hi")

  def main(args: Array[String]): Unit = {
    // 当对象方法仅调用一次的时候
    new Hello {
      override def sayHello(): Unit =  println("当对象方法仅调用一次的时候")
    }.sayHello()

    new Hi {
      override def sayHi(str: String): Unit = println(str)
    }.sayHi("hi")

    // 作为方法的参数进行传递时
    val hello = new Hello {
      override def sayHello(): Unit = println("作为方法的参数进行传递时")
    }
    show(hello)

    val hi = new Hi {
      override def sayHi(str: String): Unit = println(str)
    }
    show(hi)
  }



}
