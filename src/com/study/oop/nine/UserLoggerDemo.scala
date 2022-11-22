package com.study.oop.nine

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */

/**
 * 创建一个 Logger 特质，定义 log(msg:String) 抽象方法
 * 创建一个 User 类，该类和 Logger 特质之间无任何关系
 * 测试类 main 方法创建 User 对象，通过对象混入功能让 User 类具有 Logger 特质的 log 方法
 */
object UserLoggerDemo {
  // 定义特质
  trait Logger {
    // 定义抽象方法
    def log(msg: String): Unit

    // 定义具体方法
    def info(msg: String): Unit = log(s"INFO: ${msg}")
  }

  // 类和 Logger 特质之间无任何关系
  class User {}

  def main(args: Array[String]): Unit = {
    // 通过对象混入功能让 User 类具有 Logger 特质的 log 方法
    val user = new User with Logger {
      override def log(msg: String): Unit = println(msg)
    }
    user.log("新增用户：用户ID为1")
    user.info("项目正在运行中……")

  }
}
