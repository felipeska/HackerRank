package com.felipecb

import java.lang.Integer.min

// https://www.hackerrank.com/challenges/append-and-delete

/*
 * Complete the 'appendAndDelete' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. STRING t
 *  3. INTEGER k
 */
fun solution(t: String, s: String, k: Int): Boolean {
  if (k >= (t.length + s.length)) return true
  else {
    var sameLength = 0
    for (i in 0 until min(s.length, t.length)) {
      if (s[i] == t[i]) {
        sameLength += 1
      } else break
    }
    val remainT = t.length - sameLength
    val remainS = s.length - sameLength
    val total = remainT + remainS

    if (k == total) return true
    if (k > total) return ((k - total) % 2 == 0)
    return false
  }
}

fun main(args: Array<String>) {
  val s = readLine()!!

  val t = readLine()!!

  val k = readLine()!!.trim().toInt()

  val result = solution(s, t, k)
  val fuck = if (result == true) "Yes" else "No"
  println(fuck)
}
