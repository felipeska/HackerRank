package com.felipecb

import java.util.*

// Complete the permutationEquation function below.
fun permutationEquation(p: Array<Int>): Array<Int> {

    return arrayOf(0)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}
