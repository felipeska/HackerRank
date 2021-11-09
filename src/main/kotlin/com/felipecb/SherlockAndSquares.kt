package com.felipecb

fun main() {

}

fun squares(a: Int, b: Int): Int {
  var count = 0
  for (i in a..b) {
    var j = 1
    while (j * j <= i) {
      if (j * j == i) count++
      j++
    }
  }
  return count
}