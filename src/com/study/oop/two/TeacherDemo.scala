package com.study.oop.two

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object TeacherDemo {
  def main(args: Array[String]): Unit = {
    // 使用 Teacher 类的辅助构造器创建"张三"对象（姓名张三，性别男）
    val zhangsan =new Teacher("张三","男")
    println(zhangsan.name,zhangsan.gender)
  }

}
