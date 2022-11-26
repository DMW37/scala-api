package com.study.iostudy

/**
 * 案例练习
 */
object ImplicitListDemo {
  /**
   * 定义一个 RichList 类，用来给普通的 List 添加 avg 方法
   * 定义 avg 方法，用来获取 List 列表中所有元素的平均值
   * 定义隐式转换方法，用来将普通 List 对象转换为 RichList 对象
   * 定义 List 列表，获取其中所有元素的平均值
   *
   * @param list
   */
  // 定义一个 RichList 类，用来给普通的 List 添加 avg 方法
  class RichList(list: List[Double]) {
    // 定义 avg 方法，用来获取 List 列表中所有元素的平均值
    def avg(): Option[Double] = if (list.isEmpty) None else Some(list.sum / list.size)
  }

  def main(args: Array[String]): Unit = {
    // 定义隐式转换方法，用来将普通 List 对象转换为 RichList 对象
    implicit def list2RichList(list: List[Double]): RichList = new RichList(list)

    // 定义 List 列表，获取其中所有元素的平均值
    val list = List(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    println(list.avg())
  }
}
