package com.study.oop.five

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object ExtendsDemo {
  // 定义父类
  class Person {
    var name: String = _
    var age: Int = _
    def sayHello(): Unit = println(s"大家好，我是${name}，今年${age}。")
  }

  // 定义老师类，继承父类
  class Teacher extends Person {}

  // 定义学生类，继承父类
  class Student extends Person {}

  def main(args: Array[String]): Unit = {
    // 创建老师类和学生类
    val teacher = new Teacher
    teacher.name = "张老师"
    teacher.age = 30
    teacher.sayHello()

    val student = new Student
    student.name = "李四"
    student.age = 18
    student.sayHello()
  }
}
