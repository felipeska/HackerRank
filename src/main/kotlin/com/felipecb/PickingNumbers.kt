package com.felipecb
/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    var count = 0
    a.forEach { i ->
        var positives = 0
        var negatives = 0
        a.forEach { k ->
            if ((a[i] - a[k] >= 0) && (a[i] - a[k]) <= 1) {
                positives++
            }

            if ((a[i] - a[k] <= 0) && (a[i] - a[k]) >= -1) {
                negatives++
            }
        }

        if (count < negatives) {
            count = negatives
        }
        if (count < positives) {
            count = positives
        }
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}

