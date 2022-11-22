package com.study.oop.six

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object ClassOfDemo {
  // 定义父类
  class Person {
    var name: String = _
    def sayHello(): Unit = println(s"大家好，我是${name}。")
  }
  // 定义子类
  class Student extends Person {
    def work(): Unit = println("写作业")
  }
  def main(args: Array[String]): Unit = {
    // 使用多态特性创建子类
    val s: Person = new Student
    s.name = "李四"
    // 判断对象是否为指定类型的继承链上的对象
    println(s.isInstanceOf[Person], s.isInstanceOf[Student]) // true, true
    // 精确的判断出对象的类型
    println(s.getClass == classOf[Person], s.getClass == classOf[Student]) // false, true
  }

}
