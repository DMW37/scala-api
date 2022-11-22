package com.study.oop.two

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object StudentDemo {
  def main(args: Array[String]): Unit = {
    // 创建对象，不给构造器传入任何参数，打印对象的姓名和年龄
    val zhangsan = new Student
    println(zhangsan.age,zhangsan.name)
    // 创建"李四"对象（姓名为李四，年龄为 19），打印对象的姓名和年龄
    val lisi = new Student("李四",19)
    println(lisi.name,lisi.age)
    // 创建对象，不传入姓名参数，仅指定年龄为 20，打印对象的姓名和年龄
    val person = new Student(age = 20)
    println(person.name,person.age)
  }
}
