package com.study.collectionstudy.liststudy

/**
 * 拉链与拉开
 */
object ListZipDemo {
  def main(args: Array[String]): Unit = {
    // 定义列表 names，保存三个学生的姓名，分别为：张三、李四、王五
    val names = List("张三", "李四", "王五")
    // 定义列表 ages，保存学生的年龄，分别为：18、19、20
    val ages = List(18, 19, 20)
    // 使用`zip`将列表`names`和`ages`合并成一个列表 list
    val list = names.zip(ages)
    // zip: List((张三,18), (李四,19), (王五,20))
    println(s"zip: ${list}")
    // 使用`unzip`将列表 list 拆分成包含两个列表的元组 tuple
    val tuple = list.unzip
    // tuple: (List(张三, 李四, 王五),List(18, 19, 20))
    println(s"tuple: ${tuple}")
  }
}
