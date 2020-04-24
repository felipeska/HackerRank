package com.felipecb

import java.util.*

//https://www.hackerrank.com/challenges/counting-valleys/problem

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    if (n in 2..1000000) {
        val altitudes = mutableListOf<Int>()
        var altitude = 0
        s.forEach { step ->
            if (step == 'U') {
                altitude++
            } else if (step == 'D') {
                altitude--
            }
            altitudes.add(altitude)
        }
        altitudes.forEach {
            print("$it \t")
        }
        var next = 0
        altitudes.forEachIndexed { index, i ->
            if (i == 0 && altitudes[index - 1] < 0) {
                next++
            }
        }
        return next
    } else {
        return 0
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
