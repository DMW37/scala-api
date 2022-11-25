package com.study.functionstudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description: 柯里化函数
 */
object CurryDemo {
  // 定义方法，完成三个数的相加
  // 普通写法
  def add(n1: Int, n2: Int, n3: Int): Int = n1 + n2 + n3

  //柯里化写法
  // 写法一：直接在参数列表上进行柯里化
  // 写法一，对第一个参数柯里化
  def addCurry11(n1: Int)(n2: Int, n3: Int): Int = n1 + n2 + n3

  // 写法一，对最后一个参数柯里化
  def addCurry12(n1: Int, n2: Int)(n3: Int): Int = n1 + n2 + n3

  // 写法一，全柯里化
  def addCurry13(n1: Int)(n2: Int)(n3: Int): Int = n1 + n2 + n3

  // 写法二：新增参数列表(接收函数)完成柯里化
  // 当然在写法一的基础上也可以通过新增参数列表(接收函数)完成柯里化，此写法会更加灵活
  // 写法二，对第一个参数柯里化
  def addCurry21(n1: Int, n2: Int, n3: Int)(f: (Int, Int) => Int): Int = n1 + f(n2, n3)

  // 写法二，对最后一个参数柯里化
  def addCurry22(n1: Int, n2: Int, n3: Int)(f: (Int, Int) => Int): Int = f(n1, n2) + n3

  // 写法二，全柯里化
  def addCurry23(n1: Int, n2: Int, n3: Int)(f: (Int, Int, Int) => Int): Int = f(n1, n2, n3)

  // 写法一组合写法二
  def addCurry(n1: Int)(n2: Int)(n3: Int)(f: (Int, Int, Int) => Int): Int = f(n1, n2, n3)

  def main(args: Array[String]): Unit = {
    // 调用普通写法
    println(add(1, 2, 3))
    // 调用柯里化写法
    // 写法一，对第一个参数柯里化
    println(addCurry11(1)(2, 3))
    // 写法一，对最后一个参数柯里化
    println(addCurry12(1, 2)(3))
    // 写法一，全柯里化
    println(addCurry13(1)(2)(3))
    // 写法二，对第一个参数柯里化
    println(addCurry21(1, 2, 3)(_ + _))
    // 写法二，对最后一个参数柯里化
    println(addCurry22(1, 2, 3)(_ + _))
    // 写法二，全柯里化
    println(addCurry23(1, 2, 3)(_ + _ + _))
    // 写法一组合写法二，更加灵活
    // 三个数相加
    println(addCurry(1)(2)(3)(_ + _ + _))
    // 三个数相减
    println(addCurry(1)(2)(3)(_ - _ - _))
  }

}
