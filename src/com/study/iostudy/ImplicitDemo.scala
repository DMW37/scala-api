package com.study.iostudy

/**
 * @author: 邓明维
 * @date: 2022/11/26
 * @description: 隐式转换-手动导入
 */
object ImplicitDemo {

  import java.io.File


  // 创建`RichFile`类，提供 read 方法，用于将文件内容读取为字符串
  class RichFile(file: File) {

    import scala.io.Source

    def read(): String = Source.fromFile(file).mkString
  }

  // 在`object`单例对象中定义一个隐式转换方法，将`File`隐式转换为`RichFile`对象
  object ImplicitDemo {
    implicit def file2RichFile(file: File): RichFile = new RichFile(file)
  }

  def main(args: Array[String]): Unit = {
    // 手动导入隐式转换
    import ImplicitDemo.file2RichFile
    // 创建一个`File`类的对象，导入隐式转换，调用`File`的`read`方法
    val file = new File("2.txt")
    println(file.read())
  }

}
