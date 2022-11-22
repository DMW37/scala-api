package com.study.oop.two

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */

/**
 * 定义一个 Student 类，通过主构造器参数列表定义姓名和年龄属性，并且设置它们的默认值为张三，18
 * @param name
 * @param age
 */
class Student(var name: String = "张三", var age: Int = 18) {
  // 在主构造器中打印输出"调用主构造器"
  println("调用主构造器")
}
