package com.study.oop.seven.demo

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
// 定义狗类，继承动物类，属性：姓名、年龄，行为：跑、吃、看家

class Dog extends Animal {
  // 继承父类属性
  // 使用辅助构造器初始化属性
  def this(name: String, age: Int) {
    // 第一行需要调用主构造器或者其他构造器
    this() // 调用无参主构造器
    // 辅助构造器代码
    this.name = name
    this.age = age
  }

  // 重写父类方法
  override def eat(): Unit = println(s"我是${name}，我喜欢吃肉")

  // 自己特有的方法
  def watchHouse(): Unit = println("看家")
}
