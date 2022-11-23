package com.study.oop.thirteen

object CaseObjectDemo {
  trait Gender {}

  case object Male extends Gender {}

  case object Female extends Gender {}

  case class Person(var name: String, var sex: Gender) {}

  def main(args: Array[String]): Unit = {
    val p = Person("张三", Male)
    println(p)
  }
}
