package com.study.functionstudy

object BaseFunctionDome {
  def main(args: Array[String]): Unit = {
    // 函数最完整写法
    val func1: (Int, Double) => Double = (x: Int, y: Double) => {
      (x + y)
    }

    // 参数类型如果能够推断出来，那么可以省略
    // 如果函数体只有一行代码，可以省略花括号 {}
    val func2: (Int, Double) => Double = (x, y) => x + y

    // 函数类型可以省略，Scala 编译期可以自动推断类型
    // 因为省略了函数类型，所以参数类型就无法推断了，这时参数必须声明类型
    val func3 = (x: Int, y: Double) => x + y

    // 使用 Function1 特质声明带一个参数的方法时，需要两个参数
    // 第一个是入参的数据类型，第二个是返回值的数据类型
    val func4: Int => Int = new Function[Int, Int] {
      // 使用 Function1 特质，必须重写 apply 接口
      override def apply(x: Int): Int = x + 1
    }

    // 使用 Function2 特质声明带一个参数的方法时，需要三个参数
    // 前两个是入参的数据类型，第三个是返回值的数据类型
    val func6 = new Function2[Int, Double, (Double, Int)] {
      override def apply(x: Int, y: Double): (Double, Int) = (y, x)
    }

    val func7 = new ((Int, Double) => (Double, Int)) {
      override def apply(v1: Int, v2: Double): (Double, Int) = (v2, v1)
    }

  }
}
