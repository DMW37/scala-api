package com.study.genericsstudy

/**
 * 上界
 */
object GenericsUpDemo {
  // 定义一个 Animal 类
  class Animal

  // 定义一个 Cat 类，继承 Animal 类
  class Cat extends Animal

  // 定义一个 Tom 类，继承 Cat 类
  class Tom extends Cat

  // 定义一个泛型方法 demo，该方法接收一个 Array 参数
  // 限定 demo 方法的 Array 元素类型只能是 Animal 或者 Animal 的子类型
  def demo[T <: Animal](arr: Array[T]): Unit = {
    println(arr.mkString("Array(", ", ", ")"))
  }

  def main(args: Array[String]): Unit = {
    // 测试调用 demo 方法，传入不同元素类型的 Array
    demo(Array(new Animal, new Animal))
    demo(Array(new Cat, new Cat))
    demo(Array(new Tom, new Tom))
    // 定义上界以后，下面这行代码会报错
    //demo(Array("A", "B"))
  }
}
