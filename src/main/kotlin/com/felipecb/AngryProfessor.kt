package com.felipecb

import java.util.*


//https://www.hackerrank.com/challenges/angry-professor/problem

// Complete the angryProfessor function below.
fun angryProfessor(k: Int, a: Array<Int>): String {
    val onTime = a.count { it <= 0 }
    return if (onTime < k) {
        "YES"
    } else {
        "NO"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")

        val n = nk[0].trim().toInt()

        val k = nk[1].trim().toInt()

        val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}