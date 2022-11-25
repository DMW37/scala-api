package com.study.functionstudy

/**
 * 回调函数
 */
object CallbackFunctionDemo {
  case class Person(name: String, gender: String, phone: Long) {
    // 主函数
    def goHome(name: String, phone: Long, callbak: (String, Long) => Unit): Unit = {
      // 回调函数
      callbak(name, phone)
    }
  }

  def main(args: Array[String]): Unit = {
    val zhangsan = Person("张三", "男", 13811112222L)
    val lisi = Person("李四", "女", 13911112222L)
    lisi.goHome(zhangsan.name, zhangsan.phone, (name: String, phone: Long) => {
      println(s"给${name}打电话，电话号码为：${phone}")
    })
  }
}
