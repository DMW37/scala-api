package com.study.genericsstudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object GenericsDownDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Person 类
    class Person
    // 定义一个 Hero 类，继承 Person 类
    class Hero extends Person
    // 定义一个 Policeman 类，继承 Hero 类
    class Policeman extends Hero

    // 定义一个 demo 泛型方法，该方法接收一个 Array 参数
    // 限定 demo 方法的 Array 元素类型只能是 Person 或者 Hero
    def demo[T >: Hero](arr: Array[T]): Unit = {
      println(arr.mkString("Array(", ", ", ")"))
    }

    def main(args: Array[String]): Unit = {
      // 测试调用 demo 方法，传入不同元素类型的 Array
      // 测试调用 demo 方法，传入不同元素类型的 Array
      demo(Array(new Person, new Person))
      demo(Array(new Hero, new Hero))
      // 定义下界以后，下面这两行代码会报错
      //demo(Array(new Policeman, new Policeman))
      //demo(Array("A", "B"))
    }

  }
}
