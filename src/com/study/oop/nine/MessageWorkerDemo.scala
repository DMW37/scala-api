package com.study.oop.nine

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object MessageWorkerDemo {
  // 定义特质
  trait MessageSender {
    // 定义抽象方法
    def send(msg: String): Unit
  }

  // 定义特质
  trait MessageReceiver {
    // 定义抽象方法
    def receive(): Unit
  }

  class MessageWorker extends MessageSender with MessageReceiver {
    override def send(msg: String): Unit = println(s"MessageSender：${msg}")

    override def receive(): Unit = println("MessageReceiver：收到")
  }

  def main(args: Array[String]): Unit = {
    val worker = new MessageWorker
    worker.send("下午 18:00 聚餐！")
    worker.receive()
  }
}
