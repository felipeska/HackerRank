package com.felipecb

import java.util.Arrays

fun main() {
  val result = bigSorting(
    arrayOf(
      "31415926535897932384626433832795",
      "1",
      "3",
      "10",
      "3",
      "5"
    )
  )

  print(result.joinToString("\n"))
}

fun bigSorting(unsorted: Array<String>): Array<String> {
  unsorted.sortWith(Comparator { o1, o2 ->
    if (o1.length != o2.length) o1.length - o2.length else o1.compareTo(o2)
  })
  return unsorted
}