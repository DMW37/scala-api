package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object SimpleCaseDemo {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn
    // 提示用户录入一个单词并接收
    println("请录入大数据相关技术名词：")
    val word = StdIn.readLine().toLowerCase()
    // 判断该单词是否能够匹配以下单词，如果能匹配，返回一句话
    val result = word match {
      case "hadoop" => "大数据分布式存储和计算框架"
      case "zookeeper" => "大数据分布式协调服务框架"
      case "spark" => "大数据分布式内存计算框架"
      case _ => "未匹配"
    }
    println(s"${word} = ${result}")
    // 也可以这样写
    word match {
      case "hadoop" => println(s"${word} = 大数据分布式存储和计算框架")
      case "zookeeper" => println(s"${word} = 大数据分布式协调服务框架")
      case "spark" => println(s"${word} = 大数据分布式内存计算框架")
      case _ => println(s"${word} = 未匹配")
    }
  }
}
