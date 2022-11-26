package com.study.collectionstudy.mapstudy

/**
 * 可变 Map
 */
object MapMutableDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    // 定义一个 Map，包含以下元素：`"张三" -> 18`，`"李四" -> 19`，`"王五" -> 20`
    val map1 = mutable.Map("张三" -> 18, "李四" -> 19, "王五" -> 20)
    val map2 = mutable.Map(("张三", 18), ("李四", 19), ("王五", 20))
    // 获取键为张三的值
    println(map1("张三"))
    // 获取键为 zs 的值，如果不存在返回默认值 0
    println(map1.getOrElse("zs", 0))
    // 修改张三的年龄为 28
    map1("张三") = 28
    // 修改李四的年龄为 29
    map1.update("李四", 29)
    println(map1, map2)
  }
}
