package com.study.oop.seven.demo

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description: 定义动物抽象类，属性：姓名、年龄，行为：跑、吃
 */
abstract class Animal {
  // 定义姓名和年龄属性
  var name: String = _
  var age: Int = _

  // 定义跑的方法
  def run(): Unit = println("跑")

  // 定义吃的抽象方法
  def eat(): Unit
}
