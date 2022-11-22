package com.study.hello

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object Test09Method {
  def main(args: Array[String]): Unit = {
    /**
     * def 方法名(参数名:参数类型, 参数名:参数类型, ...): [返回值类型] = {
     * // 语句块(方法体)
     * }
     *
     * 1.方法参数列表的参数类型不能省略。
     * 2.方法返回值类型可以省略，由 Scala 编译器自动推断，但是定义递归方法，不能省略。
     * 3.方法返回值可以不写 return，默认是 {} 块的最后一个逻辑行。
     * 4.在 Scala 中，方法传参默认是 val 类型，即不可变，这意味着你在方法体内部不能改变传入的参数。这和 Scala 的设计
     * 理念有关，Scala 遵循函数式编程理念，强调方法不应该有副作用。
     */
    // 调用方法
    val result = addNum1(2, 3)
    println(result)

    // 惰性方法
    /**
     * 　　当记录方法返回值的变量被声明为 lazy 时，方法的执行将会被推迟，直到我们首次使用该值时，方法才会执行。这样
     * 的方法叫做惰性方法。
     * 注意：lazy 只支持 val，不支持 var。
     */
    lazy val r = addNum2(2, 3)
    println(r)

    // 方法参数

    /**
     * 　Scala 中的方法参数比较灵活，支持以下几种类型：
     * 默认参数
     * 带名参数
     * 变长参数
     */

    // 默认参数
    def addNum3(a: Int = 1, b: Int = 1): Int = {
      a + b
    }

    val a = addNum3()
    println(a)

    //  带名参数:调用方法时，可以通过参数名称来指定某个值所对应的参数
    def addNum4(a: Int = 1, b: Int = 1): Int = {
      a + b
    }

    val b = addNum4(b = 5)
    println(b)

    // 变长参数:　如果方法的参数是不固定的，可以将该方法的参数定义为变长参数

    /**
     * 　注意：
     * 在参数类型后面加一个 * 号，表示参数可以是 0 个或者多个
     * 一个方法有且只能有一个变长参数，并且变长参数要放到参数列表的最后边
     */

    def addNum5(a: Int*): Int = {
      a.sum
    }

    val bb = addNum5(1, 2, 3, 4, 5)
    println(bb)

    print("--------------方法调用-----------------\n")

    /**
     * 后缀调用法 : 对象名.方法名(参数)
     * 中缀调用法 : 对象名 方法名 参数
     * 花括号调用法 : Math.abs { // 语句块 } 注意：方法只有一个参数时，才能使用花括号调用法
     * 无括号调用法 : 如果方法没有参数，可以省略方法名后面的括号
     */
    println(Math.abs(-1))
    Math max(1, 2)
    Math abs -1
    // 再来看 1 + 1 ，像不像方法的调用？其实在 Scala 中 + 就是方法，在 Scala 中所有的操作符都是方法
    // 求绝对值
    Math.abs {
      -1
    }
    Math.abs {
      println("求绝对值")
      -1
    }

    // 在 Scala 中，如果方法的返回值类型为 Unit 类型，这样的方法称之为过程（Procedure）。
    // 定义一个无参数的方法
    def hello(): Unit = {
      println("Hello World!")
    }
    // 调用方法
    hello
    //过程的等号可以省略不写，例如
    // 定义一个无参数的方法
    def hello1() {
      println("Hello World!")
    }
    // 调用方法
    hello1


  }

  def addNum1(a: Int, b: Int): Int = {
    a + b
  }

  def addNum2(a: Int, b: Int) = {
    a + b
  }
}
