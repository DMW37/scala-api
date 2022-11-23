package com.study.oop.thirteen

object CaseClassMethodDemo {
  // 定义样例类
  case class Person(var name: String, var age: Int) {
    /*
    以下代码无需打开注释，样例类已默认实现 unapply
    def unapply(p: Person): Option[(String, Int)] = {
      if (p == null) None else Some(p.name, p.age)
    }
     */
  }

  def main(args: Array[String]): Unit = {
    // apply() 可以让我们快速使用类名来创建对象，省去了 new 关键字
    val p1 = Person("张三", 18)
    // toString() 可以让我们通过输出语句打印对象各个属性的值
    println(p1)
    val p2 = Person("张三", 18)
    // equals() 可以让我们直接使用`==`来比较两个样例类对象的所有成员属性值是否相等
    println(p1 == p2) // true
    // hashCode() 用来获取对象的哈希值
    // 同一个对象（样例类属性值相同即为相同对象）的哈希值肯定是相同的
    println(p1.hashCode(), p2.hashCode())
    // 特例
    println("重地".hashCode(), "通话".hashCode())
    // copy() 可以用来快速创建一个属性值相同的实例对象，还可以使用带名参数的形式给指定的成员重新赋值
    val p3 = p1.copy(age = 20)
    println(p3)
    // unapply() 提取器，快速提取对象属性
    val result = Person.unapply(p3)
    println(s"result = ${result}")
  }
}
