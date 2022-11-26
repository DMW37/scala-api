package com.study.iostudy

object WriteDemo {
  def main(args: Array[String]): Unit = {
    import java.io.FileOutputStream
    val fos = new FileOutputStream("./2.txt")
    fos.write("读万卷书，行万里路。".getBytes())
    fos.close()
 }
}
