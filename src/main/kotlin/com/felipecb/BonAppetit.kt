package com.felipecb

//https://www.hackerrank.com/challenges/bon-appetit/problem

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val totalToPay = (bill.reduce { total, item -> total + item } - bill[k]).div(2)
    if (totalToPay == b) {
        print("Bon Appetit")
    } else {
        print("${b - totalToPay}")
    }
}

fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}