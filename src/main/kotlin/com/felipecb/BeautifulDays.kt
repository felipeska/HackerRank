package com.felipecb

import java.util.*

// Complete the beautifulDays function below.
fun beautifulDays(i: Int, j: Int, k: Int): Int {
    val days = IntRange(i, j)
    var beautyDays = 0
    days.forEach { day ->
        var toReverse = day
        var reversed = 0
        while (toReverse != 0) {
            val digit = toReverse % 10
            reversed = reversed * 10 + digit
            toReverse /= 10
        }
        if ((day - reversed) % k == 0) {
            beautyDays++
        }
    }
    return beautyDays
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val ijk = scan.nextLine().split(" ")

    val i = ijk[0].trim().toInt()

    val j = ijk[1].trim().toInt()

    val k = ijk[2].trim().toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}
