package com.study.collectionstudy.setstudy

/**
 * 可变 Set
 */
object SetMutableDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    // 定义一个可变集，包含以下元素：1, 2, 3, 4
    val set = mutable.Set(1, 2, 3, 4)
    // 添加元素 5 到可变集中
    set += 5
    println(s"添加元素 5：${set}")
    // 添加元素 6, 7, 8 到可变集中
    set ++= mutable.Set(6, 7, 8)
    set ++= List(6, 7, 8)
    println(s"添加元素 6, 7, 8：${set}")
    // 从可变集中移除元素 3
    set -= 3
    println(s"从可变集中移除元素 3：${set}")
    // 从可变集中移除元素 3, 5, 7
    set --= Set(3, 5, 7)
    println(s"从可变集中移除元素 3, 5, 7：${set}")
    // 更新集合，第一个参数为要修改的值，第二个参数为 true 表示添加，false 表示删除
    set.update(2, false)
    set.update(30, true)
    println(set)
  }
}
