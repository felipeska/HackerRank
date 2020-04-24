package com.felipecb

import java.util.*

// Complete the reverseArray function below.
fun reverseArray(a: Array<Int>): Array<Int> {
    val b = mutableListOf<Int>()
    for (index in (a.size - 1) downTo 0) {
        b.add(a[index])
    }
    return b.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arrCount = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}
