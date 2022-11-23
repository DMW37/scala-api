package com.study.oop.eleven

object TraitConstructorDemo {
  trait Logger {
    println("Logger 的构造器被加载 2")
  }

  trait InfoLogger extends Logger {
    println("InfoLogger 的构造器被加载 3")
  }

  trait ErrorLogger extends Logger {
    println("ErrorLogger 的构造器被加载 4")
  }

  class Person {
    println("Person 的构造器被加载 1")
  }

  /**
   * 每个特质只有一个无参数的构造器
   * 遇到一个类继承另一个类、以及继承多个 trait 的情况，当创建该类实例时，构造器执行顺序如下：
   * 先执行父类的构造器
   * 按照继承从左到右的顺序，依次执行 trait 的构造器
   * 如果 trait 有父 trait，则先执行父 trait 的构造器
   * 如果多个 trait 有同样的父 trait，则父 trait 的构造器只初始化一次
   * 执行子类构造器
   */
  class Student extends Person with InfoLogger with ErrorLogger {
    println("Student 的构造器被加载 5")
  }

  def main(args: Array[String]): Unit = {
    val student = new Student()
  }
}
