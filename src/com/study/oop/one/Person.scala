package com.study.oop.one

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description: 创建 Person 类
 */
class Person {
  // 定义成员属性
  //val name:String = "zhangsan"
  val name = "zhangsan"
  //val age:Int = 18
  val age = 18

  // 使用 _ 初始化成员变量时，变量必须声明数据类型
  var address:String=_ //null
  var phone:Int =_ //0

  def eat():Unit={
    println("eat")
  }
  def sleep(): Unit = {
    println("睡觉")
  }
  def hello(): Unit = {
    println(s"name = ${name}，age = ${age}")
  }
}
