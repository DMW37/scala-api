package com.study.oop.seven

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object AbstractAttributeDemo {
  /**
   * // 定义抽象类
   * abstract class 抽象类名 {
   * // 定义抽象属性
   * val|var 抽象属性名:类型
   *
   * // 定义抽象方法
   * def 方法名(参数:参数类型, 参数:参数类型, ...): 返回类型
   * }
   */
  // 定义抽象类
  abstract class Person {
    // 定义抽象属性
    val name: String

    // 定义抽象方法
    def sayHello(): Unit
  }

  // 定义子类
  class Student(var n: String) extends Person {
    override val name: String = n

    override def sayHello(): Unit = println(s"大家好，我是${name}，我是一名学生。")
  }

  // 定义子类
  class Teacher(var n: String) extends Person {
    override val name: String = n

    override def sayHello(): Unit = println(s"大家好，我是${name}，我是一名老师。")
  }

  def main(args: Array[String]): Unit = {
    val teacher = new Teacher("张三")
    teacher.sayHello()
    val student = new Student("李四")
    student.sayHello()
  }
}
