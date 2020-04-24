package com.felipecb

//https://www.hackerrank.com/challenges/the-birthday-bar/problem

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var result = 0
    for (index in s.indices) {
        if (index <= s.size - 1) {
            val nextIndex = if (index + m <= s.size) (index + m) else index
            if (index == nextIndex) {
                if (s[index] == d) {
                    result++
                }
            } else {
                val sum = s.copyOfRange(index, nextIndex).reduce { acc, i -> acc + i }
                if (sum == d) {
                    result++
                }
            }
        }

    }
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
