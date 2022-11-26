package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object TypeCaseDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个变量为 Any 类型，然后分别给其赋值为"Hadoop"、1、1.0
    val a: Any = 1.0
    val result1 = a match {
      case x: String => s"${x} 是一个 String 类型的数据"
      case x: Int => s"${x} 是一个 Int 类型的数据"
      case x: Double => s"${x} 是一个 Double 类型的数据"
      case _ => "未匹配"
    }
    println(s"${a} = ${result1}")
    // 如果 case 表达式中不会使用匹配时的变量，可以使用下划线来代替
    val result2 = a match {
      case _: String => "String 类型的数据"
      case _: Int => "Int 类型的数据"
      case _: Double => "Double 类型的数据"
      case _ => "未匹配"
    }
    println(s"${a} = ${result2}")
  }
}
