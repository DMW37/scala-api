package com.study.oop.five

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object ObjectExtendsDemo {

  // 定义父类
  class Person {
    var name: String = _
    var age: Int = _
    def sayHello(): Unit = println(s"大家好，我是${name}，今年${age}。")
  }

  // 定义单例对象继承父类
  object Student extends Person{}

  def main(args: Array[String]): Unit = {
    // 单例对象无需 new，直接调用属性和方法
    Student.name = "lisi"
    Student.age = 18
    Student.sayHello()
  }

}
