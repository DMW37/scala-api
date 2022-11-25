package com.study.functionstudy

/**
 * @author: 邓明维
 * @date: 2022/11/23
 * @description:
 */
object GreatTruthsAreAlwaysSimple {

  def main(args: Array[String]): Unit = {

    def method(x: Int, y: Double): Double = {
      x + y
    }

    // 方法和函数不建议写 return 关键字，Scala 会使用函数体的最后一行代码作为返回值
    def m1(x: Int, y: Double): Double = x + y

    val f1: (Int, Double) => Double = (x: Int, y: Double) => {
      x + y
    }

    // 方法的返回值类型如果能够推断出来，那么可以省略，如果有 return 则不能省略返回值类型，必须指定(否则没有值)
    def m2(x: Int, y: Double) = x + y

    def m3(x: Int, y: Double): Double = {
      return x + y
    }

    println(m3(1, 2.2))

    // 因为函数是对象，所以函数有类型，但函数类型可以省略，Scala 编译期可以自动推断类型
    val f2 = (x: Int, y: Double) => {
      x + y
    }

    // 如果方法明确声明了返回值为 Unit，那么即使方法体中有 return 关键字也不起作用
    def m4(x: Int, y: Double): Unit = {
      return x + y
    }

    // 如果方法的返回值类型为 Unit，可以省略等号
    def m5(x: Int, y: Double) {
      x + y
    }

    // 如果函数的参数类型如果能够推断出来，那么可以省略
    val f3: (Int, Double) => Double = (x, y) => {
      x + y
    }

    // 如果方法体或函数体只有一行代码，可以省略花括号{}
    def m6(x: Int, y: Double) = x + y

    val f4 = (x: Int, y: Double) => x + y

    // 如果方法无参，但是定义时声明了 ()，调用时小括号 () 可省可不省
    def m7() = println("无参方法")

    m7
    m7()

    // 如果方法无参，但是定义时没有声明 ()，调用时必须省略小括号 ()
    def m8 = println("无参方法")

    // 如果不关心名称，只关心逻辑处理，那么函数名可以省略。也就是所谓的匿名函数
    // (x: Int, y: Double) =>x + y

    // 如果匿名函数只有一个参数，则小括号 () 和参数类型都可以省略，没有参数或参数超过一个的情况下不能省略
    val list = (1 to 10).toList
    val result1: List[Int] = list.map(x => x * 2)
    //  for (i <- result1) println(i)

    // 如果参数只出现一次，且方法体或函数体没有嵌套使用参数，则参数可以用下划线 _ 来替代
    val result2: Int = list.reduce((x, y) => x + y);
    val result3: Int = list.reduce(_ + _);
  }
}
