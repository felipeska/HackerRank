package com.felipecb

import kotlin.math.round
import kotlin.math.sqrt

// problem: https://www.hackerrank.com/challenges/encryption/problem

fun main() {
  println(encryption("haveaniceday"))
  println(encryption("chillout"))
  println(encryption("feedthedog"))
}

fun encryption(s: String): String {
  val length = s.length
  val row: Int = round(sqrt(length.toDouble())).toInt()
  val column: Int = if (row >= sqrt(length.toDouble())) row else row + 1
  var result = ""
  for (j in 0 until column) {
    var i = j
    while (i < length) {
      result += s[i]
      i += column
    }
    result += " "
  }
  return result
}