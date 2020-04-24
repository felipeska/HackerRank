package com.felipecb

import java.util.*

// https://www.hackerrank.com/challenges/utopian-tree/problem

// Complete the utopianTree function below.
fun utopianTree(n: Int): Int {
    var total = 0
    for (x in 0..n) {
        if (x % 2 == 0) {
            total += 1
        } else {
            total *= 2
        }
    }
    return total
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}
