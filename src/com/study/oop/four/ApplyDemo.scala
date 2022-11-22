package com.study.oop.four

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object ApplyDemo {
  class Person(var name: String, var age: Int) {}

  object Person {
    // 构造对象
    def apply(name: String, age: Int) = new Person(name, age)

    // 提取属性
    def unapply(p: Person): Option[(String, Int)] = {
      if (p == null)
        None
      else
        Some(p.name, p.age)
    }
  }

  def main(args: Array[String]): Unit = {
    val person = Person("张三", 12)
    println(person.name, person.age)

    val result = Person.unapply(person)
    println(s"result = ${result}")
  }

}
