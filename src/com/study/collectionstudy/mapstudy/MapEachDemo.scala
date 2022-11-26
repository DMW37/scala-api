package com.study.collectionstudy.mapstudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object MapEachDemo {
  def main(args: Array[String]): Unit = {
    val map = Map("张三" -> 18, "李四" -> 19, "王五" -> 20)
    // for
    for (elem <- map) {
      println(s"Key: ${elem._1}", s"Value: ${elem._2}")
    }
    println("----------------\n")
    // for
    for ((k, v) <- map) {
      println(s"Key: ${k}", s"Value: ${v}")
    }
    println("----------------\n")
    // foreach
    map.foreach(elem => println(elem._1, elem._2))
    println("----------------\n")
    map.foreach(elem => println(elem))
    println("----------------\n")
    // 简化版
    map.foreach(println(_))
    println("----------------\n")
    map.foreach(println)
    println("----------------\n")
    // 模式匹配后面会讲到
    map.foreach {
      case (k, v) => println(k, v)
    }

  }

}
