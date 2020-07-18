package com.felipecb

import java.util.Scanner

// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
  var energy = 100
  var cloud = 0
  do {
    cloud = (cloud + k) % c.size
    if (c[cloud] == 0) {
      energy -= 1
    } else if (c[cloud] == 1) {
      energy -= 3
    }

  } while (cloud != 0)
  return energy
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val nk = scan.nextLine().split(" ")

  val n = nk[0].trim().toInt()

  val k = nk[1].trim().toInt()

  val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

  val result = jumpingOnClouds(c, k)

  println(result)
}
