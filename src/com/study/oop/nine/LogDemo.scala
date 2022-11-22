package com.study.oop.nine

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object LogDemo {
  // 定义特质
  trait Logger {
    // 定义抽象方法
    def log(msg: String): Unit

    // 定义具体方法
    def info(msg: String): Unit = log(s"INFO: ${msg}")

    def warning(msg: String): Unit = log(s"WARNING: ${msg}")

    def error(msg: String): Unit = log(s"ERROR: ${msg}")
  }

  class ConsoleLogger extends Logger {
    def log(msg: String): Unit = println(msg)
  }

  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger
    logger.log("项目正在运行中……")
    logger.info("项目正在运行中……")
    logger.warning("xx方法已过时，建议修改为xx方法！")
    logger.error("xx对象没有xx方法！")
  }

}
