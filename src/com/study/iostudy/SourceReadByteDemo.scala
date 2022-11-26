package com.study.iostudy

/**
 * 按字节读取
 */
object SourceReadByteDemo {
  def main(args: Array[String]): Unit = {
    import java.io.{File, FileInputStream}
    val file = new File("C:\\Users\\woaixiejuan\\Desktop\\3.jpg")
    // 创建字节输入流，用来读取数据
    val fis = new FileInputStream(file)
    // 创建字节数组，用来存储读取到的字节
    val bytes = new Array[Byte](file.length().toInt)
    // 开始读取，将读取到的数据存储到字节数组中，并返回有效读取的字节长度
    val len = fis.read(bytes)
    println(s"文件字节长度 = ${len}")
    // 关闭字节输入流
    fis.close()
  }
}
