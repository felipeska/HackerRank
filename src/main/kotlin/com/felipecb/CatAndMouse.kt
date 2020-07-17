package com.felipecb

import java.util.Scanner
import kotlin.math.absoluteValue

// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String = when {
  (x - z).absoluteValue == (y - z).absoluteValue -> "Mouse C"
  (x - z).absoluteValue < (y - z).absoluteValue -> "Cat A"
  else -> "Cat B"
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val q = scan.nextLine().trim().toInt()

  for (qItr in 1..q) {
    val xyz = scan.nextLine().split(" ")

    val x = xyz[0].trim().toInt()

    val y = xyz[1].trim().toInt()

    val z = xyz[2].trim().toInt()

    val result = catAndMouse(x, y, z)

    println(result)
  }
}
