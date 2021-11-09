package com.felipecb

fun main() {
  minimumDistances(arrayOf(7, 1, 3, 4, 1, 7))
}

fun minimumDistances(a: Array<Int>): Int {
  // Write your code here
  val map: MutableMap<Int, Int> = mutableMapOf()
  var min = -1
  a.forEachIndexed { index, i ->
    if (map.containsKey(i)) {
      val next = map[i]
      val result = index - (next ?: -1)
      map[i] = result
      if (min == -1) {
        min = result
      } else if (result < min) {
        min = result
      }
    } else {
      map[i] = index
    }
  }
  return min
}
