package com.study.hello

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object StringTest {
  def main(args: Array[String]): Unit = {
    /**
     * 双引号
     * 三引号
     * 插值表达式
     */
    val name = "字符串"

    /**
     * val|var 变量名 = """
     * 字符串1
     * 字符串2
     * """
     */
    var address =
      """
        |湖南省
        |长沙市
        |衡阳市
        |耒阳市
        |""".stripMargin
    println(name, address)

    /**
     * val|var 变量名 = s"${变量|表达式}字符串"
     * 使用插值表达式必须在字符串前添加 s
     * 在字符串中，可以使用 ${} 来引用变量或者编写表达式， {} 可以省略
     */
    val message = s"我是:${name},来自:${address}"
    println(message)
  }
}
