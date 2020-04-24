package com.felipecb

import java.util.*

//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var result = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i != j) {
                if (i < j) {
                    if ((ar[i] + ar[j]) % k == 0) {
                        result++
                    }
                }
            }
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}