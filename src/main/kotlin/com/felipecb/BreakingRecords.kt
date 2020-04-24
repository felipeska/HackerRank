package com.felipecb

import java.util.*

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {

    var bestRecordForSeason = scores.first()
    var badRecordForSeason = scores.first()
    var lowestScore = 0
    var highestScore = 0
    scores.forEach { score ->
        if (score < badRecordForSeason) {
            badRecordForSeason = score
            lowestScore++
        }
        if (score > bestRecordForSeason) {
            bestRecordForSeason = score
            highestScore++
        }
    }

    return arrayOf(highestScore, lowestScore)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
