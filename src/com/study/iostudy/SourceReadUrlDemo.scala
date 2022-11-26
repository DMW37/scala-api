package com.study.iostudy

/**
* 从 URL 或其他源读取
*/
object SourceReadUrlDemo {
  def main(args: Array[String]): Unit = {
    import scala.io.Source
    // 通过请求 URL 地址读取数据
    val str1 = Source.fromURL("https://www.baidu.com")
    println(str1.mkString)
    // 从其他源读取数据
    val str2 = Source.fromString("百度一下，你就知道")
    println(str2.mkString)
 }
}
