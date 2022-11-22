package com.study.hello

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hello world","china")

    // val 常量名:常量类型 = 初始值
    var MAX_NUM1:Int =100;
    print(MAX_NUM1)

    // 简写
    var MAX_NUM2 =100;
    println(MAX_NUM2)

    var name = "张三";
    var address = "长沙市"
    var isNan = true;
    var idCard = null;
    var age = 12;
    var money = 12.890;
    money = 123;
    print(name,address,isNan,idCard,age,money)
  }
}
