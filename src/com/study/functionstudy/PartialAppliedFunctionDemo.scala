package com.study.functionstudy

/**
 * @author: 邓明维
 * @date: 2022/11/25
 * @description: 偏应用函数
 */
object PartialAppliedFunctionDemo {

  def main(args: Array[String]): Unit = {
    // 定义一个记录日志的`log`函数，参数为：`level, message`
    val log = (level: String, message: String) => {
      println(level + ": " + message)
    }
    // 固化`log`函数的`level`参数，产生新的具有特定意义的 logXxx 函数
    val logWarning = (message: String) => {
      log("WARN", message)
    }
    val logError = (message: String) => {
      log("ERROR", message)
    }
    logWarning("这是一条警告日志！")
    logError("这是一条错误日志！")
    println("=" * 20, "方法版", "=" * 20)

    // 定义一个记录日志的`log`方法，参数为：`level, message`
    def log2(level: String, message: String): Unit = {
      println(level + ": " + message)
    }

    // 固化`log`方法的`level`参数，产生新的具有特定意义的 logXxx 方法
    def logWarning2(message: String): Unit = {
      log2("WARN", message)
    }

    def logError2(message: String): Unit = {
      log2("ERROR", message)
    }

    logWarning2("这是一条警告日志！")
    logError2("这是一条错误日志！")
  }

}
