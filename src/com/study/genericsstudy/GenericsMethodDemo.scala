package com.study.genericsstudy

/**
 * 泛型方法
 */
object GenericsMethodDemo {
  // 定义方法不指定泛型，只能存储指定类型数据
  def getMiddleElement1(arr: Array[Int]): Int = arr(arr.length / 2)

  // 定义方法指定泛型，可以随意存储
  def getMiddleElement2[T](arr: Array[T]): T = arr(arr.length / 2)

  def test[T](x: T): T = x

  case class Person(name: String, age: Int)

  def main(args: Array[String]): Unit = {
    val arr1 = Array[Int](1, 2, 3, 4, 5)
    println(getMiddleElement1(arr1))
    val arr2 = Array(2, 3.14, "abc", true, null)
    println(getMiddleElement2(arr2))
    println(test(1), test("1"), test(3.14))
    println(test(Person("张三", 18)), test(Person("李四", 19)))
  }
}
