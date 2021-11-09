package com.felipecb

fun main() {
  solve(6, arrayOf(5, 4, 4, 2, 2, 8))
}

fun solve(n: Int, arr: Array<Int>): Array<Int> {

  var copy = mutableListOf<Int>()
  copy.addAll(arr)
  var cut = copy.min() ?: 0
  val result = mutableListOf<Int>()
  while (cut > 0) {
    copy = copy.map { it - cut }.toMutableList()
    result.add(copy.count { it >= 0 })
    cut = copy.filter { it > 0 }.min() ?: 0
  }
  return result.toIntArray().toTypedArray()
}