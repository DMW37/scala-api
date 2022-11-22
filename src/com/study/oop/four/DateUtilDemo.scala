package com.study.oop.four

import java.time.LocalDate

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object DateUtilDemo {
  def main(args: Array[String]): Unit = {
    // 将日期对象转换为年月日字符串，例如：2022-10-01
    val dateStrSrc = "2022-10-01"
    val dateDesc = DateUtil.string2Date(dateStrSrc)
    println(dateDesc, dateDesc.getClass)

    // 将年月日字符串转换为日期对象
    val dateSrc = LocalDate.now()
    val dateStrDesc = DateUtil.date2String(dateSrc)
    println(dateStrDesc,dateStrDesc.getClass)
  }
}
