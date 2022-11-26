package com.study.iostudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object ImplicitDemo04 {
  // 定义一个 show 方法，实现将传入的值使用指定的前缀字符串和后缀字符串进行包裹
  def show(name: String)(implicit delimit: (String, String)): String = delimit._1 + name + delimit._2

  def main(args: Array[String]): Unit = {
    // 自动导入隐式参数
    // 使用隐式参数定义分隔符
    implicit val delimit_default: (String, String) = ("【" -> "】")
    // 当需要用到隐式参数时，程序会自动调用
    println(show("张三"))
    // 也可以正常调用
    println(show("李四")("[", "]"))
  }

}
