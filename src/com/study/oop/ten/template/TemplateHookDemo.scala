package com.study.oop.ten.template

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object TemplateHookDemo {
  // 模板类
  abstract class Cook {
    // 食用油
    def oil(): Unit

    // 鸡蛋
    def egg(): Unit

    // 西红柿
    def tomato(): Unit

    // 钩子函数：子类可以覆写，让子类决定是否添加油，默认加油
    def isAddOil(): Boolean = true

    // 封装具体的行为（模板方法）：做饭
    def cook(): Unit = {
      // 如果子类决定添加，则执行添加油的方法
      if (this.isAddOil()) {
        this.oil()
      }
      this.egg()
      this.tomato()
    }
  }

  // 我做饭
  class Me extends Cook {
    // 是否添加油标记，默认加油
    private var addOilFlag: Boolean = true

    // 通过公共的 set 方法让子类控制是否加油
    def setAddOilFlag(addOilFlag: Boolean): Unit = {
      this.addOilFlag = addOilFlag
    }

    // 重写父类的钩子函数，返回子类的加油标记
    override def isAddOil(): Boolean = this.addOilFlag

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
    // 反正做饭不好吃，摆烂了，直接不放油
    me.setAddOilFlag(false)
    me.cook()
    val chef = new Chef()
    chef.cook()
  }

}
