package com.study.oop.eleven

object TraitExtendsDemo {
  class Message {
    val name: String = "Scala"

    def printMsg(msg: String): Unit = println(msg)
  }

  /**
   * 在 Scala 中，特质也可以继承类，继承后特质会将类中的非私有成员都继承下来
   */
  trait Logger extends Message {}

  class ConsoleLogger extends Logger {}

  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger()
    println(logger.name)
    logger.printMsg("Hello World!")
  }
}
