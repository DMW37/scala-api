package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object UnapplyDemo {

  // Person 类
  class Person(private var name: String, private var age: Int) {}

  // Person 类的伴生对象
  object Person {
    // 构造对象
    def apply(name: String, age: Int) = new Person(name, age)

    // 提取属性
    def unapply(p: Person): Option[(String, Int)] = {
      if (p == null) {
        None
      } else {
        Some(p.name, p.age)
      }
    }
  }

  // 样例类
  case class Student(private var name: String, private var age: Int) {}

  def main(args: Array[String]): Unit = {
    // 免 new 构造对象
    val person = Person("张三", 18)
    // 提取属性
    // 方式一：如果属性不是私有的，直接 .属性
    // 方式二：如果属性是私有的，通过属性对应的 getter 方法获取
    // 方式三：调用 unapply 方法
    val result = Person.unapply(person)
    println(s"result = ${result}")

    // 方式四：通过模式匹配获取
    person match {
      case Person(name, age) => println(s"${name}, ${age}")
      case _ => println("未匹配")
    }

    // 样例类自动实现 unapply，无需手动定义
    val student = Student("李四", 19)
    // 调用 unapply 方法
    println(Student.unapply(student))
    // 通过模式匹配获取
    student match {
      case Student(name, age) => println(s"${name}, ${age}")
      case _ => println("未匹配")
    }

  }
}
