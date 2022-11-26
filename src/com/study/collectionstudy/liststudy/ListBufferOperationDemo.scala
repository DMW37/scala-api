package com.study.collectionstudy.liststudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object ListBufferOperationDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.{ArrayBuffer, ListBuffer}
    // 定义可变列表
    val list3 = ListBuffer("Hadoop", "Spark", "Flink")
    // 修改元素值
    list3(0) = "ZooKeeper"
    list3.update(1, "Scala")
    // 获取元素值
    println(list3(list3.length - 1), list3.last)
    // 添加单个元素
    list3 += "Hive"
    println(list3)
    // 删除单个元素
    list3 -= "Hadoop" // 元素不存在不会报错
    println(list3)
    // 添加多个元素
    list3 ++= List("ZooKeeper", "HBase")
    list3 ++= ListBuffer("Phoenix", "Sqoop")
    println(list3)
    // 删除多个元素
    list3 --= Array("ZooKeeper", "HBase")
    list3 --= ArrayBuffer("Phoenix", "Sqoop")
    println(list3)
    // toList
    println(list3.toList.getClass)
    // toArray
    println(list3.toArray.getClass)
    // toBuffer
    println(list3.toBuffer.getClass)

  }
}
