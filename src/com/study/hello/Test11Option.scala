package com.study.hello

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object Test11Option {
  def main(args: Array[String]): Unit = {
    /**
     * 　　Scala 中，Option 类型表示可选值。这种类型的数据有两种形式：
     * Some(x) ：表示实际的值
     * None ：表示没有值
     * 提示：使用 getOrElse 方法，当值为 None 时可以指定一个默认值
     *
     */

    /**
     * TODO:定义一个两个数相除的方法，使用 Option 类型来封装结果
     * 除数为零时，返回 None；当除数不为零时，返回 Some(相除)。
     */
    def division(a: Int, b: Int): Option[Int] = {
      if (b == 0) {
        // 当除数为零时，打印异常信息
        None
      } else {
        // 当除数不为零时，打印相除结果
        Some(a / b)
      }
    }

    val a = 10
    val b = 0
    val result = division(10, 0)
    println(result)
    // 配合 Option 的 isEmpty 方法来检测元素是否为 None
    println(result.isEmpty)
    // 配合 Option 的 getOrElse 方法返回友好提示
    println(result.getOrElse("对不起，除数不能为零"))
  }
}
