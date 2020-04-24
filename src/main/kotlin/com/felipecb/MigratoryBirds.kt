package com.felipecb

//https://www.hackerrank.com/challenges/migratory-birds/problem

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    val results: HashMap<Int, Int> = HashMap()
    for (x in 1..5) {
        results[x] = arr.count { it == x }
    }
    val highestFrequency = results.maxBy { it.value }
    return highestFrequency?.key ?: 0
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
