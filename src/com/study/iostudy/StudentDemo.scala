package com.study.iostudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description:
 */
object StudentDemo {
  // 定义样例类 Student，属性为：姓名，语文成绩，数学成绩，英语成绩
  case class Student(var name: String, var chinese: Int, var math: Int, var english: Int) {
    // 类中有一个获取总成绩的方法
    def getScoreSum: Int = chinese + math + english
  }

  def main(args: Array[String]): Unit = {
    import java.io.{BufferedWriter, FileWriter}
    import scala.collection.mutable.ListBuffer
    import scala.io.Source
    // 获取数据源
    val source = Source.fromFile("./student.txt")
    // 读取指定文件中(./data/student.txt)所有的数据，并将其放入数组
    val iter = source.getLines().map(_.split(","))
    //iter.foreach(s => println(s.mkString))
    // 定义可变列表 ListBuffer[Student] 用来记录所有学生信息
    val stuListBuffer = new ListBuffer[Student]
    // 遍历数组将其封装成 Student 类的对象后并添加至可变列表
    iter.foreach(s => stuListBuffer += Student(s(0), s(1).toInt, s(2).toInt, s(3).toInt))
    println(stuListBuffer)
    // 对可变列表进行降序排序操作，并将其转为不可变列表 List
    val stuList = stuListBuffer.sortBy(_.getScoreSum).reverse.toList
    println(stuList)
    // 按照指定格式，通过流对象将排序后的数据写出到目的地文件中(./data/student_sort.txt)
    val bw = new BufferedWriter(new FileWriter("./student_sort.txt"))
    stuList.foreach(s => bw.write(s"${s.name},${s.chinese},${s.math},${s.english}${s.getScoreSum}\n"))
    // 关闭所有流对象
    bw.close()
    source.close()
  }
}
