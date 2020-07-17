package com.felipecb

import java.util.Scanner

// https://www.hackerrank.com/challenges/permutation-equation/problem

// Complete the permutationEquation function below.
fun permutationEquation(p: Array<Int>): Array<Int> {
  val y = IntArray(p.size)
  for (i in p) {
    y[p[p[i - 1] - 1] - 1] = i
  }
  return y.toTypedArray()
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val n = scan.nextLine().trim().toInt()

  val p = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

  val result = permutationEquation(p)

  println(result.joinToString("\n"))
}
