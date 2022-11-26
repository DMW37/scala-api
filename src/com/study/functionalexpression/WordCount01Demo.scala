package com.study.functionalexpression

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object WordCount01Demo {
  def main(args: Array[String]): Unit = {
    /**
     * 已知集合为： List("Hello Hadoop", "Hello ZooKeeper", "Hello Hadoop Hive", "Hello Hadoop
     * HBase", "Hive Scala Spark") 。计算集合中每个单词出现的次数，并将排名前三的返回。
     *
     */
    // 准备集合
    val list = List("Hello Hadoop", "Hello ZooKeeper", "Hello Hadoop Hive", "Hello Hadoop HBase",
      "Hive Scala Spark")
    // 对集合每个元素进行扁平化映射处理
    val wordList = list.flatMap(_.split("\\s+"))
    println(wordList)
    // 对相同单词进行分组操作
    //val groupMap1 = wordList.groupBy(w => w)
    val groupMap2 = wordList.groupBy(_.toString)
    println(groupMap2)

    // 分组后获取 map 的 value 集合的长度即为单词出现的次数
    val countMap = groupMap2.map(kv=>(kv._1,kv._2.size))
    println(countMap)
    // 按 value 倒序取前三
    val result1 = countMap.toList.sortBy(w => w._2).reverse.take(3)
    println(result1)

    // 简写形式
    val value: List[(String, Int)] = list.flatMap(_.split("\\s+")).groupBy(_.toString).map(kv => (kv._1, kv._2.size)).toList.sortWith(_._2 > _._2).take(3)
    println(value)

  }
}
