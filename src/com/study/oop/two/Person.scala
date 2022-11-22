package com.study.oop.two

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description: 访问权限
 */
class Person {
  // Scala 中的权限修饰符只有：private、private[this]、protected、默认这四种
  // 任何没有被标为 private 或 protected 的成员都是公共的

  /**
   * 　　需求：定义一个 Person 类，定义私有成员属性 name 和 age，定义私有成员方法 hello。定义设置和获取私有成员属
   * 性的公开方法。
   */

  // 定义私有成员属性
  private var name: String = _
  private var age: Int = _

  // 定义设置私有成员属性的公开方法
  def setName(name: String): Unit = this.name = name

  def setAge(age: Int): Unit = this.age = age

  // 定义获取私有成员属性的公开方法
  def getName(): String = this.name

  def getAge(): Int = this.age

  // 使用 _ 初始化成员变量时，变量必须声明数据类型
  var address: String = _
  var phone: Int = _

  // 定义成员方法
  def eat(): Unit = println("吃饭")

  def sleep(): Unit = println("睡觉")

  // 定义私有成员方法
  private def hello1(): Unit = println(s"hello1() name = ${name}，age = ${age}")

  // 定义受保护方法
  protected def hello2():Unit =println(s"hello2() name = ${name}，age = ${age}")

}
