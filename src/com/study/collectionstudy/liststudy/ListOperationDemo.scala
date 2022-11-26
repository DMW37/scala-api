package com.study.collectionstudy.liststudy

/**
 * 列表常见基础操作
 */
object ListOperationDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表 list1，包含以下元素：`1, "2", 3.14, true, null`
    val list1 = List(1, "2", 3.14, true, null)
    // 使用`isEmpty`方法判断列表是否为空，并打印结果
    println(s"isEmpty: ${list1.isEmpty}")
    // 再定义一个列表 list2，包含以下元素：`"a", "b", "c"`
    val list2 = List("a", "b", "c")
    // 使用`++`将两个列表拼接起来，并打印结果
    val list3 = list1 ++ list2
    println(s"list1 ++ list2: ${list3}")
    // 使用`head`方法，获取列表的首个元素，并打印结果
    println(s"head: ${list3.head}")
    // 使用`tail`方法，获取列表中除首个元素之外的其他所有元素，并打印结果
    println(s"tail: ${list3.tail}")
    // 使用`reverse`方法，将列表元素反转，并打印结果
    println(s"reverse: ${list3.reverse}")
    // 使用`take`方法，获取列表中的前缀元素，并打印结果
    println(s"take: ${list3.take(3)}") // 获取前 3 个元素
    // 使用`drop`方法，获取列表中的后缀元素，并打印结果
    println(s"drop: ${list3.drop(3)}") // 除了前 3 个返回其余后缀元素
  }
}
