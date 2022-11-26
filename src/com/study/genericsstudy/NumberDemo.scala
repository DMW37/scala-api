package com.study.genericsstudy

/**
* 案例练习
*/
object NumberDemo {
  def main(args: Array[String]): Unit = {
    import java.io.{BufferedWriter, FileWriter}
    import scala.io.Source
    // 读取数据源
    val source = Source.fromFile("1.txt")
    // 按行分割并转为 List 列表
    val list: List[String] = source.mkString.split("\\s+").toList
    // 将列表中字符串转为 Int，去重后进行排序
    val result: List[Int] = list.map(_.toInt).distinct.sorted
    // 打印结果确保操作无误
    println(s"result = ${result}")
    // 创建写出流写出数据至 ./data/2.txt
    val bw = new BufferedWriter(new FileWriter("2.txt"))
    // 循环写出
    for (i <- result) {
      bw.write(i + "\n")
   }
    // 释放资源
    bw.close()
    source.close()
 }
}
