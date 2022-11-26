package com.study.casestudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object MapCaseDemo {
  def main(args: Array[String]): Unit = {
    // 定义 Map
    val map = Map("A" -> 1, "B" -> 2, "C" -> 3)
    // 使用匹配模式，匹配上述 Map
    for ((k, v) <- map) {
      println(k, v)
    }

    println("=" * 20, "华丽的分割线", "=" * 20)
    // 只匹配 v = 3 的元素
    for ((k, 3) <- map) {
      println(k, 3)
    }

    println("=" * 20, "华丽的分割线", "=" * 20)
    // 只匹配 k = "A" 的元素
    for (("A", v) <- map) {
      println("A", v)
    }

    println("=" * 20, "华丽的分割线", "=" * 20)

    // 条件守卫
    for ((k, v) <- map if v > 2) {
      println(k, v)
    }
  }
}
