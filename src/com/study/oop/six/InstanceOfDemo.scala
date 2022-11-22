package com.study.oop.six

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object InstanceOfDemo {
  // 定义父类
  class Person {
    var name: String = _

    def sayHello(): Unit = println(s"大家好，我是${name}。")
  }

  // 定义子类
  class Student extends Person {
    def work(): Unit = println("写作业")
  }

  // 定义子类
  class Teacher extends Person {
    def teach(): Unit = println("授课")
  }

  def main(args: Array[String]): Unit = {
    // 使用多态特性创建子类
    /*
     多态：同一个事物在不同时刻表现出来的不同形态
     弊端：父类引用不能直接调用子类的特有成员
     */
    val t: Person = new Teacher
    t.name = "zhangsan"
    // 只可以调用父类成员
    t.sayHello()
    // 不可以调用子类的特有成员
    // t.teach()

    // 使用 isInstanceOf[类型] 进行判断
    if (t.isInstanceOf[Teacher]) {
      // 使用 asInstanceOf[类型] 进行转换
      val teacher = t.asInstanceOf[Teacher]
      // 调用子类的特有成员
      teacher.teach()
    }

    val s: Person = new Student
    s.name = "李四"
    // 只可以调用父类成员
    s.sayHello()
    // 不可以调用子类的特有成员
    //s.work()
    // 使用 isInstanceOf[类型] 进行判断
    if (s.isInstanceOf[Student]) {
      // 使用 asInstanceOf[类型] 进行转换
      val student = s.asInstanceOf[Student]
      // 调用子类的特有成员
      student.work()
    }

    /**
     * isInstanceOf 只能判断对象是否为指定类型的继承链上的对象，而不能精确的判断出是哪个对象。如果要求精确
     * 的判断出对象的类型，只能使用 getClass 和 classOf 来实现。
     * 精确获取对象的类型
     * val clazz = p.getClass
     * val clazz = classOf[类型]
     */

  }
}
