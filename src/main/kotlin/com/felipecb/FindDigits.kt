package com.felipecb

import java.util.Scanner

//https://www.hackerrank.com/challenges/find-digits/problem

// Complete the findDigits function below.
fun findDigits(n: Int): Int = n.toString()
    .map { Character.getNumericValue(it) }
    .filter { it != 0 }
    .fold(0, { acc, next -> if (n % next == 0) (acc + 1) else acc })

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val t = scan.nextLine().trim().toInt()

  for (tItr in 1..t) {
    val n = scan.nextLine().trim().toInt()

    val result = findDigits(n)

    println(result)
  }
}
