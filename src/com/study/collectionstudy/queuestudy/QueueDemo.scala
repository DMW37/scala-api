package com.study.collectionstudy.queuestudy

/**
 * 案例演示
 */
object QueueDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    // 定义可变队列 Queue。存储 1 到 5
    val q = mutable.Queue(1, 2, 3, 4, 5)
    // 往队列中添加元素 6
    q.enqueue(6)
    println(q, q.size)
    // 往队列中添加元素 7, 8, 9
    q.enqueue(7, 8, 9)
    println(q, q.size)
    // 移除队列的第一个元素
    println(q.dequeue(), q.size)
    // 移除队列的第一个奇数
    println(q.dequeueFirst(x => x % 2 == 1), q.size)
    // 简化版
    println(q.dequeueFirst(_ % 2 == 1), q.size)
    // 移除队列中所有的偶数
    println(q.dequeueAll(x => x % 2 == 0), q.size)
    // 简化版
    println(q.dequeueAll(_ % 2 == 0), q.size)
  }
}
