package com.study.casestudy

object PartialFunctionDemo {
  def main(args: Array[String]): Unit = {
    // 定义偏函数
    val pf: PartialFunction[Int, String] = {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "Other"
    }
    // 调用偏函数
    // println(pf(1), pf(2), pf(3), pf(4))
    // isDefinedAt
    println(pf.isDefinedAt(5))

    println("=" * 20)
    val onePF: PartialFunction[Int, String] = {
      case 1 => "One"
    }
    val twoPF: PartialFunction[Int, String] = {
      case 2 => "Two"
    }
    val threePF: PartialFunction[Int, String] = {
      case 3 => "Three"
    }
    val otherPF: PartialFunction[Int, String] = {
      case _ => "Other"
    }
    val newPF = onePF orElse twoPF orElse threePF orElse otherPF
    println(newPF(1), newPF(2), newPF(3), newPF(4))

    println("=" * 20)
    val pf3: PartialFunction[Int, String] = {
      case 1 => "One"
      case _ => "Other"
    }
    val pf4: PartialFunction[String, String] = {
      case str if str == "One" => "The num is 1"
      case _ => "invalid input"
    }
    val num = pf3 andThen pf4
    println(num(1))

    println("=" * 20)
    val pf5: PartialFunction[Int, String] = {
      case 1 => "One"
    }
    println(pf5.applyOrElse(1, { n: Int => "Other" }))
    println(pf5.applyOrElse(2, { n: Int => "Two" }))

  }
}
