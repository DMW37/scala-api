package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object RegexDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个字符串，表示邮箱
    val email = "mrhelloworld@126.com"
    // 定义一个正则表达式，匹配邮箱是否合法
    val emailRegex = """^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$""".r
    if (emailRegex.findAllMatchIn(email).size != 0) {
      println(s"${email}是一个合法的邮箱")
    } else {
      println(s"${email}是一个不合法的邮箱")
    }

    // 获取邮箱运营商
    val emailList2 = List("abc@qq.com", "qweasd@126.com", "zs@126.com", "abcde.com")
    val emailRegex2 = """^[A-Za-z0-9\u4e00-\u9fa5]+@([a-zA-Z0-9_-]+)(\.[a-zA-Z0-9_-]+)+$""".r
    val tuples = emailList2.map {
      // company 匹配正则的第一个小括号，domain 匹配正则的第二个小括号
      case emailRegex2(company, domain) => company -> domain
      case x => x -> "未匹配"
    }
    println(s"tuples = ${tuples}")
  }
}
