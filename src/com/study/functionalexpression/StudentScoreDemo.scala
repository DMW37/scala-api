package com.study.functionalexpression

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object StudentScoreDemo {
  def main(args: Array[String]): Unit = {
    // 定义一个列表，记录学生成绩。格式为：`姓名、语文成绩、数学成绩、英语成绩`
    val list = List(
      ("张三", 37, 90, 100), ("李四", 90, 73, 81),
      ("王五", 60, 90, 76), ("赵六", 59, 21, 72), ("田七", 100, 100, 100)
    )
    // 获取所有语文成绩在 60 分（含）及以上的同学信息
    //    val result1 = list.filter(s=>s._2>=60)
    val result1 = list.filter(_._2 >= 60)
    println(s"result1 = ${result1}")

    // 获取所有学生的总成绩
    val result2 = list.map(s => s._1 -> (s._2 + s._3 + s._4))
    println(s"result2 = ${result2}")

    // 按照总成绩降序排列
    //val result3 = result2.sortWith((x, y) => x._2 > y._2)
    val result3 = result2.sortWith(_._2 > _._2)
    println(s"result3 = ${result3}")
  }
}
