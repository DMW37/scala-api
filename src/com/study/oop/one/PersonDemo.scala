package com.study.oop.one

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description: 创建 Person 对象
 */
object PersonDemo {
  def main(args: Array[String]): Unit = {
    // 创建 Person 类型的对象
    val person = new Person()
    println(person.name)
    println(person.age)
    println(person.address)
    println(person.phone)

    // 访问成员方法
    person.eat()
    person.sleep()
    person.hello()
  }
}
