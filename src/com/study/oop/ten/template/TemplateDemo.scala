package com.study.oop.ten.template

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object TemplateDemo {
  // 模板类
  abstract class Cook {
    // 食用油
    def oil(): Unit

    // 鸡蛋
    def egg(): Unit

    // 西红柿
    def tomato(): Unit

    // 封装具体的行为（模板方法）：做饭
    def cook(): Unit = {
      this.oil()
      this.egg()
      this.tomato()
    }
  }

  // 我做饭
  class Me extends Cook {
    override def oil(): Unit = println("自己：油放多了！")

    override def egg(): Unit = println("自己：鸡蛋炒糊了！")

    override def tomato(): Unit = println("自己：西红柿放多了！")
  }

  // 五星大厨做饭
  class Chef extends Cook {
    override def oil(): Unit = println("大厨：油适量！")

    override def egg(): Unit = println("大厨：鸡蛋适量！")

    override def tomato(): Unit = println("大厨：西红柿适量！")
  }

  def main(args: Array[String]): Unit = {
    val me = new Me()
    me.cook()
    val chef = new Chef()
    chef.cook()
  }

}
