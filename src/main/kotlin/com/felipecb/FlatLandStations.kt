package com.felipecb

import java.lang.Math.abs

fun main() {

}

fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
  var max = 0

  if (n == c.size) {
    return 0
  }

  for (i in 0 until n) {
    var min = abs(i - c.first())
    for (j in 0 until c.size) {
      val distance = abs(i - c[j])
      if (distance < min) {
        min = distance
      }
    }

    if (min > max) {
      max = min
    }
  }
  return max
}

