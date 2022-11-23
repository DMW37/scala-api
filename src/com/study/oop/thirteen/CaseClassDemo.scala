package com.study.oop.thirteen

object CaseClassDemo {
  case class Person(name: String, var age: Int) {
  }

  def main(args: Array[String]): Unit = {
    val person = new Person("张三", 18)
    println(person.name, person.age)
    // person.name = "李四"
    person.age = 19
    println(person.name, person.age)
  }
}
