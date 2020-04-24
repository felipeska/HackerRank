package com.felipecb

import java.util.*

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    val scoresList = scores.toList()
    val aliceRankings = mutableListOf<Int>()
    var rank = 1
    val ranking = mutableListOf<Int>()
    scores.forEachIndexed { index, score ->
        val nextIndex = if (index + 1 >= scores.size) index else index + 1
        val nextScore = scores[nextIndex]
        ranking.add(rank)
        if (score > nextScore) {
            rank++
        }
    }
    alice.forEach { aliceScore ->
        when {
            aliceScore > scores.first() -> {
                aliceRankings.add(1)
            }
            aliceScore < scores.last() -> {
                aliceRankings.add(ranking[scores.size - 1] + 1)
            }
            else -> {
                val invertedInsertionPoint = scoresList.binarySearch { score -> compareValues(aliceScore, score) }
                val actualInsertionPoint = -(invertedInsertionPoint + 1)
                val finalPosition = if (actualInsertionPoint < 0) invertedInsertionPoint else actualInsertionPoint
                aliceRankings.add(ranking[finalPosition])
            }
        }
    }
    return aliceRankings.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scoresCount = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val aliceCount = scan.nextLine().trim().toInt()

    val alice = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = climbingLeaderboard(scores, alice)

    println(result.joinToString("\n"))
}
