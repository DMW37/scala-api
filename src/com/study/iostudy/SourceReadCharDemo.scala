package com.study.iostudy

import scala.io.{BufferedSource, Source}

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object SourceReadCharDemo {
  def main(args: Array[String]): Unit = {
    // 读取数据源（文本文件、URL、字符串、InputStream 流等）
    val source: BufferedSource = Source.fromFile("C:\\Users\\woaixiejuan\\Desktop\\1.txt", "UTF-8");
    // 如果文件不是很大，可以直接将文件读取到一个字符串中
    //val str = source.mkString
    //println(s"str = ${str}")
    // 以字符为单位进行读取
    val iter: BufferedIterator[Char] = source.buffered
    // 将读取的数据放入列表
    while (iter.hasNext) {
      print(iter.next())
    }

    // 关闭Source对象
    if (source.nonEmpty) {
      source.close()
    }
  }
}
