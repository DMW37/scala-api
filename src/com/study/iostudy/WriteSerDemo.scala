package com.study.iostudy

/**
* 序列化和反序列化
*/
object WriteSerDemo {
  // 一个类的对象要想实现爱你序列化和反序列化操作，则该类必须继承 Serializable 特质
  // class Person(var name: String, var age: Int) extends Serializable
  // 定义样例类（样例类自动继承了 Serializable）Person，属性为姓名和年龄
  case class Person(var name: String, var age: Int)
  def main(args: Array[String]): Unit = {
    import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}
    // 创建 Person 样例类的对象 p
    val person = Person("张三", 18)
    // 通过序列化操作将对象 p 写入到项目 data 文件夹下的 3.txt 文件中
    // 创建序列化流
    val oos = new ObjectOutputStream(new FileOutputStream("./3.txt"))
    // 将对象写入到文件
    oos.writeObject(person)
    // 关闭序列化流
    oos.close()
    // 通过反序列化操作从项目 data 文件下的 3.txt 文件中读取 Person 对象
    // 创建反序列化流
    val ois = new ObjectInputStream(new FileInputStream("./3.txt"))
    // 读取对象，并将 AnyRef 类型对象转换为 Person 类型
    val p = ois.readObject().asInstanceOf[Person]
    println(p)
    // 关闭反序列化流
    ois.close()
 }
}
