package com.study.oop.ten.adapter

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object AdapterDemo {
  // 定义特质
  trait GloryOfKings {
    def confrontation(): Unit

    def jungle(): Unit

    def support(): Unit

    def farm(): Unit

    def midsolo(): Unit
  }

  // 定义适配器类
  abstract class Player extends GloryOfKings {
    override def confrontation(): Unit = {}

    override def jungle(): Unit = {}

    override def support(): Unit = {}

    override def farm(): Unit = {}

    override def midsolo(): Unit = {}
  }

  class Rookie extends Player {
    override def support(): Unit = println("系统推荐：蔡文姬、瑶、明世隐")

    override def midsolo(): Unit = println("系统推荐：草丛三姐妹")
  }

  def main(args: Array[String]): Unit = {
    val rookie = new Rookie
    rookie.support()
    rookie.midsolo()
  }


}
