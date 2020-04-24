package com.felipecb

import java.util.*

// https://www.hackerrank.com/challenges/electronics-shop/problem

/*
 * Complete the getMoneySpent function below.
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    /*
     * Write your code here.
     */
    val purchases = mutableListOf<Int>()
    if (keyboards.size > drives.size) {
        for (keyboardPrices in keyboards.filter { it < b }) {
            for (drivesPrices in drives.filter { it < b }) {
                if (keyboardPrices + drivesPrices <= b) {
                    purchases.add(keyboardPrices + drivesPrices)
                }
            }
        }
    } else {
        for (drivesPrices in drives.filter { it < b }) {
            for (keyboardPrices in keyboards.filter { it < b }) {
                if (drivesPrices + keyboardPrices <= b) {
                    purchases.add(drivesPrices + keyboardPrices)
                }
            }
        }
    }

    return purchases.max() ?: -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}
