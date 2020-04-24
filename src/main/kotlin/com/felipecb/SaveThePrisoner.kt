package com.felipecb

import java.util.*

//https://www.hackerrank.com/challenges/save-the-prisoner/problem

// Complete the saveThePrisoner function below.
fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    val a = s + m - 1
    return if (a > n) {
        if (a % n == 0) {
            n
        } else a % n
    } else a
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nms = scan.nextLine().split(" ")

        val n = nms[0].trim().toInt()

        val m = nms[1].trim().toInt()

        val s = nms[2].trim().toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}
