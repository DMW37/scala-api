package com.study.collectionstudy.mapstudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object MapOperationDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    // 定义一个可变 Map，包含以下元素：`"张三" -> 18`，`"李四" -> 19`，`"王五" -> 20`
    val map = mutable.Map("张三" -> 18, "李四" -> 19, "王五" -> 20)
    // 获取张三的年龄
    println(s"获取张三的年龄：${map("张三")}")
    // 获取所有学生姓名
    println("获取所有学生姓名：")
    println(map.keys)
    for (elem <- map) {
      println(elem._1)
    }
    // 获取所有学生年龄
    println("获取所有学生年龄：")
    println(map.values)
    for (elem <- map) {
      println(elem._2)
    }
    // 获取所有学生姓名和年龄
    println("获取所有学生姓名和年龄：")
    for ((k, v) <- map) {
      println(k, v)
    }
    // 获取赵六的年龄，如果赵六不存在则返回 -1
    val zhaoliu = map.getOrElse("赵六", -1)
    println(s"获取赵六的年龄，如果赵六不存在则返回 -1：${zhaoliu}")
    // 新增一个学生：`"赵六" -> 21`
    println("新增赵六：")
    map += "赵六" -> 21
    println(map)
    // 将李四从 Map 中移除
    println("移除李四：")
    map -= "李四"
    println(map)
  }

}
