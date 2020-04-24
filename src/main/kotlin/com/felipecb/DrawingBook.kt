package com.felipecb

import java.util.*
import kotlin.math.min

//https://www.hackerrank.com/challenges/drawing-book/problem

//Complete pageCount function below.
fun pageCount(n: Int, p: Int): Int {
    val rightToLeft = (1..n).toList()
    val leftToRight = (n downTo 1).toList()
    val first = rightToLeft.groupBy { it / 2 }
    val second = leftToRight.groupBy { it / 2 }.toList()

    var firstResult = 0
    var secondResult = 0
    first.forEach { (key, value) ->
        if (value.contains(p)) {
            firstResult = key
        }
    }
    second.forEachIndexed { index, pair ->
        if (pair.second.contains(p)) {
            secondResult = index
        }

    }
    return min(firstResult, secondResult)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
