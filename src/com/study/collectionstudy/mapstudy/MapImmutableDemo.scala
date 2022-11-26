package com.study.collectionstudy.mapstudy

/**
 * 不可变 Map
 */
object MapImmutableDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个 Map，包含以下元素：`"张三" -> 18`，`"李四" -> 19`，`"王五" -> 20`
    val map1 = Map("张三" -> 18, "李四" -> 19, "王五" -> 20)
    val map2 = Map(("张三", 18), ("李四", 19), ("王五", 20))
    // 获取键为张三的值
    println(map1("张三"))
    println(map1, map2)
    // 获取键为 zs 的值，如果不存在返回默认值 0
    println(map1.getOrElse("sfs", 0))
    println(map1.get("sfs"))
  }
}
