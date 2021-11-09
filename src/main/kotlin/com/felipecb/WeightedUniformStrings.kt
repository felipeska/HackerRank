package com.felipecb

import java.lang.StringBuilder

fun main() {
  println(
    weightedUniformStrings(
      s = "abccddde",
      queries = arrayOf(1, 3, 12, 5, 9, 10)
    ).joinToString("\n")
  )
}

fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {
  var count: Char = ' '
  var countN = 0
  val set: HashSet<Int> = hashSetOf()
  val result = Array(queries.size) { "" }
  for (i in s.indices) {
    if (count == s[i] && countN > 0) {
      count = s[i]
      countN++
    } else {
      count = s[i]
      countN = 1
    }
    val weight = (count.toInt() - 96) * countN
    set.add(weight)
  }
  for (i in queries.indices) {
    if (set.contains(queries[i]))
      result[i] = "Yes"
    else
      result[i] = "No"
  }
  return result
}