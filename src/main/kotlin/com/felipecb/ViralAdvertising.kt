package com.felipecb

import java.util.*

// Complete the viralAdvertising function below.
fun viralAdvertising(n: Int): Int {
    val divisor = 2
    var receipts = 5
    var liked = 0
    var cumulative = 0
    for (day in 1..n) {
        liked = receipts / divisor
        receipts = liked * 3
        cumulative += liked
    }
    return cumulative
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
