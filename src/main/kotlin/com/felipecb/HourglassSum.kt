package com.felipecb

import java.util.*

// Complete the hourglassSum function below.
fun hourglassSum(arr: Array<Array<Int>>): Int {
    val sum = mutableListOf<Int>()
    for (w in 0 until 4) {
        for (x in 0 until 4) {
            sum.add(
                arr[w][x] + arr[w][x + 1]
                        + arr[w][x + 2]
                        + arr[w + 1][x + 1]
                        + arr[w + 2][x]
                        + arr[w + 2][x + 1]
                        + arr[w + 2][x + 2]
            )
        }
    }
    return sum.max()!!
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
