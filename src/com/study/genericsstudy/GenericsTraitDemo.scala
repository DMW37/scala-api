package com.study.genericsstudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object GenericsTraitDemo {
  // 定义泛型特质 Logger，该特质有一个变量 name 和 log 方法，它们都使用 Logger 特质的泛型
  trait Logger[T] {
    val name: T

    def log(b: T)
  }

  // 定义单例对象 InfoLogger 继承 Logger 特质
  object InfoLogger extends Logger[String] {
    override val name: String = "INFO"

    override def log(b: String): Unit = println(b)
  }

  def main(args: Array[String]): Unit = {
    InfoLogger.log(s"${InfoLogger.name}：这是一条日志信息")
  }
}
