package com.study.collectionstudy.mapstudy

/**
 * 案例练习
 */
object CountCharDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    import scala.io.StdIn
    // 提示用户录入字符串并接收
    println("请录入一个字符串：")
    val str = StdIn.readLine()
    // 定义 Map 集合用来存储字符及其出现的次数。键：字符，值：字符对应的次数
    val map = mutable.Map[Char, Int]()
    // 将用户录入的字符串转成字符数组
    val chars = str.toCharArray
    for (k <- chars) {
      // 如果字符是第一次出现，就将其次数记录为 1
      if (!map.contains(k)) {
        map += (k -> 1)
      } else { // 如果字符重复出现，将其次数做 +1 操作然后重新存储
        map += (k -> (map(k) + 1))
      }
    }
    // 遍历集合查看结果
    map.foreach(println)
  }
}
