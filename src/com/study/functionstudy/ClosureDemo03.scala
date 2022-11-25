package com.study.functionstudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description:
 */
object ClosureDemo03 {

  def main(args: Array[String]): Unit = {
    val outer = () => {
      var num = 0
      val inner = () => {
        for (i <- 1 to 10) {
          num += 1
        }
        println(num)
      }
      inner
    }
    val func = outer()
    func() // 10
    func() // 20

  }
}
