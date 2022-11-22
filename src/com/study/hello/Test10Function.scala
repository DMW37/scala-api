package com.study.hello

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object Test10Function {
  def main(args: Array[String]): Unit = {
    /**
     * 　　Scala 混合了面向对象特性和函数式的特性。在函数式编程中，函数是一等公民，主要体现在：
     * 函数可以存储在变量中
     * 函数可以作为参数
     * 函数可以作为返回值
     *
     * 函数式编程:函数式编程指的是方法的参数列表可以接收函数对象
     *
     * 定义函数
     */

    /**
     * // 因为函数是对象，所以函数有类型：(函数参数类型1, 函数参数类型2,...) => 函数返回值类型
     * val 函数名: (函数参数类型1, 函数参数类型2,...) => 函数返回值类型 = (参数名:参数类型, 参数名:参数类型, ...)
     * => {
     * 函数体
     * }
     *
     * 注意：
     * 函数的本质就是引用类型，相当于 Java 中 new 出来的实例，所以函数是在堆内存中开辟空间；
     * 函数的定义不需要使用 def 关键字，但定义的函数一定要有输入和返回值，没有返回值相当于返回的是 Unit；
     * 函数不建议写 return 关键字，Scala 会使用函数体的最后一行代码作为返回值；
     * 因为函数是对象，所以函数有类型，但函数类型可以省略，Scala 编译期可以自动推断类型。
     */

    //  定义一个函数，接收两个参数，将它们相加后的结果返回
    val addNum1: (Int, Int) => Int = (a: Int, b: Int) => {
      a + b
    }

    // 省略函数返回值
    val addNum2 = (a: Int, b: Int) => {
      a + b
    }
    // 调用函数
    val result = addNum1(2, 3)
    println("result:", result)

    // TODO:方法和函数的区别

    /**
     * 在 Java 中，方法和函数之间没有任何区别，只是叫法不同。但是在 Scala 中，函数和方法就有区别了，具体如下：
     * 1.方法是隶属于类或者对象的，在运行时，它会被加载到 JVM 的方法区中
     * 2.函数是一个对象，继承自 FunctionN，函数对象有 apply，curried，toString，tupled 这些方法，方法则没有
     * 在 Scala 中，函数是对象，而方法是属于对象的，所以可以理解为：方法归属于函数
     */

    // 定义方法
    def addNum(a: Int, b: Int): Int = {
      a + b
    }

    // 将方法赋值给变量会报错 error: missing argument list for method addNum
    //    var a = addNum;
    // 将函数赋值给变量则不会报错
    var a = addNum1
    // 通过变量调用函数
    println(a(2, 3))

    // TODO:方法转换为函数

    /**
     * 可不可以将方法转换为函数呢？答案是可以的，Scala 提供了对应的解决方案，使用 _ 。
     * val|var 变量名 = 方法名 _
     */
    def addNUm3(a: Int, b: Int): Int = {
      a + b
    }

    // 转函数
    var m2f = addNUm3 _
    //    调用函数
    println(m2f(2, 4))
  }
}
