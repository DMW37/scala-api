package com.study.oop.four

import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * @author: 邓明维
 * @date: 2022/11/22
 * @description:
 */
object DateUtil {
  // 将日期对象转换为年月日字符串，例如：2022-10-01
  def date2String(date:LocalDate,pattern:String = "yyyy-MM-dd"):String  = {
    DateTimeFormatter.ofPattern(pattern).format(date)
  }

  // 将年月日字符串转换为日期对象
  def string2Date(dateString:String,pattern:String="yyyy-MM-dd"):LocalDate = {
    LocalDate.parse(dateString,DateTimeFormatter.ofPattern(pattern))
  }
}
