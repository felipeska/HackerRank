package com.felipecb


fun main() {

}

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
  var result = arrayListOf<Int>()
  queries.forEach { query ->
    val r = k % a.size
    var pos = query - r
    if (pos < 0) {
      pos -= a.size
    } else {
      result.add(a[pos])
    }
  }
  return result.toTypedArray()
}
