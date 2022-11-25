package com.study.functionstudy

object ResultFunctionDemo {
  def main(args: Array[String]): Unit = {
    def func1(): (Int, Double) => Double = {
      def func2(x: Int, y: Double): Double = {
        x + y
      }

      func2
    }

    println(func1()(2, 3.0))
  }
}
