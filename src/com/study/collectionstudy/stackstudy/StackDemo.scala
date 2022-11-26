package com.study.collectionstudy.stackstudy

/**
 * 可变 Stack
 */
object StackDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    // 定义可变栈 Stack，存储 1 到 5
    val s = mutable.Stack(1, 2, 3, 4, 5)
    // 通过 top() 方法获取栈顶元素
    println(s.top, s.size)
    // 通过 push() 方法把元素 6 添加到栈顶
    s.push(6)
    println(s, s.size)
    // 通过 pushAll() 往栈顶位置添加 Seq(11, 22, 33)
    s.pushAll(Seq(11, 22, 33))
    println(s, s.size)
    // 通过 pop() 方法移除栈顶元素
    s.pop()
    println(s, s.size)
    // 通过 clear() 方法移除集合内所有元素
    s.clear()
    println(s, s.size)
  }
}
