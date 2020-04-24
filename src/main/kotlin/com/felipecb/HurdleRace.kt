package com.felipecb

import java.util.*

// Complete the hurdleRace function below.
fun hurdleRace(k: Int, height: Array<Int>): Int {
    val maxHeight = height.max()!!
    return if (maxHeight < k) 0 else maxHeight - k
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val height = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
