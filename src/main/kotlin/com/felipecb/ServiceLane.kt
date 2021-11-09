package com.felipecb

// https://www.hackerrank.com/challenges/service-lane/

/*
 * Complete the 'serviceLane' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY cases
 */
fun serviceLane(n: Int, width: Array<Int>, cases: Array<Array<Int>>): Array<Int> {
  val result = mutableListOf<Int>()
  val p = arrayOf(0,9,3,2)
  p.sort()
  cases.forEach { case ->
    val start = case[0]
    val end = case[1] + 1
    val range = width.copyOfRange(start, end)
    val min = range.min()
    result.add(min ?: 0)
  }
  return result.toTypedArray()
}

fun main(args: Array<String>) {
  val first_multiple_input = readLine()!!.trimEnd().split(" ")

  val n = first_multiple_input[0].toInt()

  val t = first_multiple_input[1].toInt()

  val width = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

  val cases = Array<Array<Int>>(t, { Array<Int>(2, { 0 }) })

  for (i in 0 until t) {
    cases[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
  }

  val result = serviceLane(n, width, cases)

  println(result.joinToString("\n"))
}
