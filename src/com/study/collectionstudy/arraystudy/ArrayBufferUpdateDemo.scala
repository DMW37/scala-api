package com.study.collectionstudy.arraystudy

/**
* 可变数组的修改
*/
object ArrayBufferUpdateDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer
    // 定义变长数组
    val arr3 = ArrayBuffer("Hadoop", "Spark", "Flink")
    // 添加单个元素
    arr3 += "Hive"
    println(arr3)
    // 删除单个元素
    arr3 -= "Hadoop" // 元素不存在不会报错
    println(arr3)
    // 添加多个元素
    arr3 ++= Array("ZooKeeper", "HBase")
    arr3 ++= ArrayBuffer("Phoenix", "Sqoop")
    println(arr3)
    // 删除多个元素
    arr3 --= Array("ZooKeeper", "HBase")
    arr3 --= ArrayBuffer("Phoenix", "Sqoop")
    println(arr3)
    // 修改元素
    arr3(0) = "A"
    arr3.update(1, "B")
    println(arr3)
 }
}
