package com.felipecb

import java.util.*

//https://www.hackerrank.com/challenges/sock-merchant/problem

// Complete sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val groups = ar.groupBy { it }

    var numberOfPairs = 0
    groups.forEach { (_, value) ->
        if (value.size > 1) {
            numberOfPairs += value.size / 2
        }
    }
    return numberOfPairs
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
