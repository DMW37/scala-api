package com.study.oop.four

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object ScalaApplicationDemo {

  /**
   * 　　一个 class 和 一个 object 具有相同的名字时，这个 object 就被称为伴生对象，这个 class 被称为伴生类。
   *
   * 伴生对象和伴生类必须是相同的名字；
   * 伴生对象和伴生类在同一个 scala 源文件中；
   * 伴生对象和伴生类可以互相访问 private 私有属性
   *
   * Scala 这样做是为了将静态和非静态进行分离管理，方便代码的维护
   */
  class ScalaApplication {
    def printApp(): Unit = println(ScalaApplication.APP_NAME)
  }

  object ScalaApplication {
    //private[this] val APP_NAME = "Scala 从入门到入坟"
    private val APP_NAME = "Scala 从入门到入坟"
  }

  def main(args: Array[String]): Unit = {
    new ScalaApplication().printApp()
  }

}
