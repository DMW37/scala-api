package com.study.oop.seven.demo

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */

/**
 * // 定义猫类，继承动物类，属性：姓名、年龄，行为：跑、吃、抓老鼠
 * // 使用主构造器初始化属性
 */
class Cat extends Animal {

  // 继承父类属性
  // 使用辅助构造器初始化属性
  // 使用辅助构造器初始化属性
  def this(name: String, age: Int) {
    // 第一行需要调用主构造器或者其他构造器
    this() // 调用无参主构造器
    // 辅助构造器代码
    this.name = name
    this.age = age
  }


  override def eat(): Unit = println(s"我是${name}，我喜欢吃鱼")

  // 自己特有的方法
  def catchMouse(): Unit = println("抓老鼠")
}
