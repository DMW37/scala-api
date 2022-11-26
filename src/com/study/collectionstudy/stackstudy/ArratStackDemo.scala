package com.study.collectionstudy.stackstudy

/**
 * 可变 ArratStack
 */
object ArratStackDemo {
  /**
   * 定义可变栈 ArrayStack，存储 1 到 5
   * 通过 dup() 方法复制栈顶元素
   * 通过 preserving() 方法实现先清空集合元素，然后恢复集合中清除的元素
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    // 定义可变栈 ArrayStack，存储 1 到 5
    val as = mutable.ArrayStack(1, 2, 3, 4, 5)
    // 通过 dup() 方法复制栈顶元素
    /* as.dup()
     println(as, as.size)
     // 通过 preserving() 方法实现先清空集合元素，然后恢复集合中清除的元素
     as.preserving({
       as.clear()
       println(as, as.size)
     })*/
    println(as, as.size)
  }
}
