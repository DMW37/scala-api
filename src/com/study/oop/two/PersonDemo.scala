package com.study.oop.two

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object PersonDemo {
  def main(args: Array[String]): Unit = {
    val person = new Person
    // 设置属性
    person.setName("张三")
    person.setAge(123)
    // 无法获取私有属性
    // person.name
    // 无法调用私有方法
    //    person.hello1()
    println(person.getName())
    println(person.getAge())
  }
}
