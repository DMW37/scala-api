package com.study.iostudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object WordCountDemo {
  def main(args: Array[String]): Unit = {
    import scala.io.{BufferedSource, Source}
    // 读取数据源
    val source: BufferedSource = Source.fromFile("C:\\Users\\woaixiejuan\\Desktop\\wordcount.txt", "UTF-8")
    // 以行为单位进行读取
    val line: Iterator[String] = source.getLines()
    // 将读取的数据放入列表
    val list = line.toList
    // 对集合每个元素挨个进行处理，处理方式为按空格进行分割并将分割后的单词展开
    val wordList = list.flatMap(_.split("\\s+"))
    // 对相同单词进行分组操作
    val groupMap = wordList.groupBy(w => w)
    // 分组后获取 map 的 value 集合的长度即为单词出现的次数
    val countMap = groupMap.map(kv => (kv._1, kv._2.size))
    // 按 value 倒序取前三
    val result1 = countMap.toList.sortBy(w => w._2).reverse.take(3)
    println(result1)
    // 简写形式
    val result2 = list.flatMap(_.split("\\s+"))
      .groupBy(w => w)
      .map(kv => (kv._1, kv._2.size))
      .toList.sortBy(_._2)
      .reverse.take(3)
    println(result2)


  }
}
