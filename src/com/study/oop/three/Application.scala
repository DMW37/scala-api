package com.study.oop.three

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description: 单例对象
 */
object Application {
  // 在 object 中定义的成员属性类似于 Java 的静态属性，在内存中都只有一个
  //  在单例对象中，可以直接使用 单列对象名. 的形式调用成员
  val APP_NAME = "Scala 从入门到入坟"

  // 单例对象定义方法
  def printSplitLine(): Unit = println("=" * 20 + " 华丽的分割线 " + "=" * 20)

  /**
   * 在 Scala 程序中，如果要运行一个程序，必须有一个 main 方法。在 Java 中 main 方法是静态的，而在 Scala 中没有静
   * 态方法，所以这个 main 方法必须在一个单例对象中
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println(Application.APP_NAME)
    Application.printSplitLine()

  }

}
