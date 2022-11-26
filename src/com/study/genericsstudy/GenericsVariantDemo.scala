package com.study.genericsstudy

/**
 * 非变、协变、逆变
 */
object GenericsVariantDemo {
  class A

  class B extends A

  // 非变
  class Temp1[T]

  // 协变
  class Temp2[+T]

  // 逆变
  class Temp3[-T]

  def main(args: Array[String]): Unit = {
    // 测试非变
    val t1: Temp1[B] = new Temp1[B]
    // 编译报错，非变操作后两个类之间不会产生任何关系
    // val t2: Temp1[A] = t1

    // 测试协变
    val t3: Temp2[B] = new Temp2[B]
    // 正常编译且运行，协变操作后两个类之间关系不发生任何改变
    val t4: Temp2[A] = t3
    // 测试逆变
    val t5: Temp3[B] = new Temp3[B]
    // 编译报错，逆变操作后两个类之间关系进行颠倒
    //val t6: Temp3[A] = t5
    // 以下逆变操作正常编译且运行
    val t7: Temp3[A] = new Temp3[A]
    val t8: Temp3[B] = t7
  }
}
