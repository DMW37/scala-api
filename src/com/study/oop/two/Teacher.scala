package com.study.oop.two

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */

/**
 * 定义一个 Teacher 类，主构造器为空
 */
class Teacher {
  // 在主构造器中打印输出"调用主构造器"
  println("调用主构造器")

  // 定义属性
  var name: String = _
  var gender: String = _

  // 辅助构造器
  def this(name:String,gender:String){
    // 辅助构造器的第一行代码，必须调用主构造器或者其他辅助构造器
    // 通过 this 关键字调用本类的主构造器
    this()
    // 在辅助构造器中打印输出"调用辅助构造器"
    println("辅助构造器")
    this.name = name
    this.gender = gender
  }
}
