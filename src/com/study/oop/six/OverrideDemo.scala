package com.study.oop.six

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object OverrideDemo {
  // 定义父类
  class Person {
    val name = "张三"
    var age = 18

    def sayHello(): Unit = println(s"大家好，我是${name}，今年${age}。Person")
  }

  // 子类
  class Student extends Person {
    // 重新父类属性
    override val name = "李四";
    // 以下代码会报错 variable age cannot override a mutable variable
    //override var age = 19

    // 重写父类方法
    override def sayHello(): Unit = {
      // 父类的属性不能直接通过 super.属性 来调用
      //println(s"${super.name} say hello")
      // 调用父类方法
      super.sayHello()
      // 执行子类自己的代码
      println(s"大家好，我是${name}，今年${age}。Student")
    }
  }

  def main(args: Array[String]): Unit = {
    val student = new Student
    student.sayHello()
  }

}
