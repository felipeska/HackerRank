package com.felipecb

import java.lang.StringBuilder

fun main() {
  println(palindromeIndex("aaa"))
}

/*
 * Complete the 'palindromeIndex' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */
fun palindromeIndex(s: String): Int {
  for (i in 0 until s.length) {
    var countLeft = 0
    var countRight = s.length - 1
    var isPalindrome = true

    if (countLeft == i) {
      countLeft++
    }
    if (countRight == i) {
      countRight--
    }
    while (isPalindrome) {
      if (s[countLeft] == s[countRight]) {
        if(countLeft >= countRight + 1)
          return i

        countLeft++
        countRight--


        if (countLeft == i) {
          countLeft++
        }
        if (countRight == i) {
          countRight--
        }
      } else {
        isPalindrome = false
      }
    }
  }
  return -1
}