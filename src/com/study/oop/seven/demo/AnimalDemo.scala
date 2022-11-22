package com.study.oop.seven.demo

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object AnimalDemo {
  def main(args: Array[String]): Unit = {

    val a1: Animal = new Cat("Tom", 3)
    a1.run()
    a1.eat()
    if (a1.isInstanceOf[Cat]) {
      val cat = a1.asInstanceOf[Cat]
      cat.catchMouse()
    } else {
      println("对不起，它不是猫")
    }

    val a2: Animal = new Dog(name = "Spike", age = 5)
    a2.run()
    a2.eat()
    if (a2.isInstanceOf[Dog]) {
      val dog = a2.asInstanceOf[Dog]
      dog.watchHouse()
    } else {
      println("对不起，它不是狗")
    }
  }

}
