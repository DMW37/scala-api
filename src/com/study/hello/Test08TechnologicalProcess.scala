package com.study.hello

import scala.util.control.Breaks._

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object Test08TechnologicalProcess {
  def main(args: Array[String]): Unit = {
    /**
     * 顺序结构 :与java一致
     * 选择结构
     * 循环结构
     */
    // 三元表达式 : 在 Scala 中，没有三元表达式，可以使用 if 表达式替代三元表达式
    // 如果大括号 {} 内的逻辑代码只有一行，则大括号可以省略
    var age = 18;
    //  定义常量，接收 if 语句的返回值
    var result = if (age >= 18) "成年" else "未成年"
    print(result)

    // 循环结构
    // TODO: for循环
    // for 循环的格式和用法与 Java 有些差异，Scala 中的 for 表达式功能更加强大
    /**
     * for (i <- 表达式|数组|集合) {
     * // 语句块(也叫循环体)
     * }
     *
     */
    /*  for (i <- 1 to 10)
        println(s"hello scala:${i}")

      // 嵌套循环
      // 方案一：普通写法
      for (i <- 1 to 5) {
        for (j <- 1 to 5) {
          print("#")
        }
        println()
      }
      // 方案二：压缩版
      for (i <- 1 to 5) {
        for (j <- 1 to 5) {
          if (j == 5) println("#") else print("#")
        }
      }*/
    // 方案三：合并版
    for (i <- 1 to 5; j <- 1 to 5) {
      if (j == 5) println("#") else print("#")
    }
  }

  // 守卫 :　　for 表达式中，可以添加 if 判断语句，这个 if 判断就称之为守卫。通过守卫可以让 for 表达式更加简洁。
  /**
   * for (i <- 表达式|数组|集合 if 表达式) {
   * // 语句块
   * }
   */
  // 打印 1~10 的偶数
  println("------------------")
  for (i <- 1 to 10 if i % 2 == 0) {
    println(i)
  }

  // yeild 生成器
  /** *
   * yield 是一个类似 return 的关键字，但是 yield 不会结束函数，而 return 会结束函数。如果在循环结构中使用了 yeild，
   * 相当于迭代一次遇到 yield 时就将 yield 后面(右边)的值放入一个集合，最后整个循环结束时将集合返回。我们把使用了
   * yeild 的 for 表达式称之为推导式。yield 不仅可以使用于 for 循环中，还可以使用于某个函数的参数，只要这个函数的参数
   * 允许被迭代。
   *
   * 下一次迭代时，从上一次迭代遇到的 yield 后面的代码(下一行)开始执行
   */

  // 将 1~10 的偶数返回
  val result = for (i <- 1 to 10 if i % 2 == 0) yield i
  println(result)

  // TODO:while
  /**
   * // 初始化条件
   * while (条件表达式) {
   * // 语句块
   * // 控制条件
   * }
   *
   */

  // TODO:do while
  /**
   * // 初始化条件
   * do {
   * // 语句块
   * // 控制条件
   * } while (条件表达式)
   */

  // TODO: break continue
  /**
   * 在 Scala 中，类似 Java 的 break 和 continue 关键字被移除了，如果一定要使用 break/continue，需要使用
   * scala.util.control 包下的 Breaks 类的 breakable 块和 break 方法。
   * 实现 break 是用 breakable 将整个 for 表达式包起来
   * 实现 continue 是用 breakable 将 for 表达式的循环体包起来
   *
   */


  breakable(
    for (i <- 1 to 10) {
      if (i == 5) break() else println(i)
    }
  )

  print("-----------------\n")
  // 当 i == 5 时跳过当次循环，继续下一次
  for (i <- 1 to 10) {
    breakable {
      if (i == 5) break() else println(i)
    }
  }

  // 方案一：普通写法
  for (i <- 1 to 9) {
    for (j <- 1 to i) {
      print(s"${j} * ${i} = ${j * i}\t")
    }
    println()
  }
  // 方案二：合并版
  for (i <- 1 to 9; j <- 1 to i) {
    print(s"${j} * ${i} = ${j * i}\t")
    if (j == i) println()
  }
  // 方案三：压缩版
  for (i <- 1 to 9; j <- 1 to i) {
    if (j == i) println(s"${j} * ${i} = ${j * i}\t") else print(s"${j} * ${i} = ${j * i}\t")
  }

}
