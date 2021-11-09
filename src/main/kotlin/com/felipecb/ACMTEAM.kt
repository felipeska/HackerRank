package com.felipecb

fun main() {
  println(acmTeam(arrayOf("10101", "11110", "00010")).joinToString("\n"))
  println(acmTeam(arrayOf("10101", "11100", "11010", "00101")).joinToString("\n"))
}

fun acmTeam(topic: Array<String>): Array<Int> {
  var result = 0
  var teams = 0
  for (i in topic.indices) {
    for (j in i until topic.size) {
      var resultPairs = 0
      for (l in 0 until topic[i].length) {
        if (topic[i][l] == '1' || topic[j][l] == '1') {
          resultPairs++
        }
      }
      if (resultPairs > result) {
        result = resultPairs
        teams = 1
      } else if (resultPairs == result) {
        teams++
      }
    }
  }
  return arrayOf(result, teams)
}