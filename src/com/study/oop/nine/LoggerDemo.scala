package com.study.oop.nine

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */

/**
 * 创建一个 Logger 特质，定义 log(msg:String) 抽象方法
 * 创建一个 ConsoleLogger 类，继承 Logger 特质，重写 log 方法并打印消息
 * 测试类 main 方法创建 ConsoleLogger 对象，调用 log 方法
 */
object LoggerDemo {
  /**
   * trait 特质名称 {
   * // 具体属性
   * // 抽象属性
   *
   * // 具体方法
   * // 抽象方法
   * }
   *
   */
  // 定义特质
  trait Logger {
    def log(msg: String): Unit
  }

  /**
   * class 类 extends 特质1 with 特质2 {
   * // 重写抽象属性
   * // 重写抽象方法
   * }
   */
  class ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println(s"$msg")
  }

  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger
    logger.log("项目正在运行..........")
  }
}
