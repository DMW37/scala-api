package com.study.functionstudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description:
 */
object RecursionFileDemo {

  import java.io.File

  // 定义`printFile(dir: File)`方法，该方法接收一个文件夹路径，
  // 用来打印该文件夹下所有文件和文件夹路径
  def printFile(dir: File): Unit = {
    if (!dir.isDirectory) {
      println("路径不合法")
      return
    }
    // 如果用户录入文件夹路径，程序继续
    // 通过 File#listFiles() 获取该目录下所有的文件或者文件夹的 File 对象
    val files: Array[File] = dir.listFiles()
    // 遍历
    for (file <- files) {
      // 判断，如果是文件直接输出（递归出口），如果是文件夹路径就递归
      if (file.isFile) println(file) else printFile(file)
    }
  }
  def main(args: Array[String]): Unit = {
    printFile(new File("D:\\BaiduNetdiskDownload"))
  }
}
