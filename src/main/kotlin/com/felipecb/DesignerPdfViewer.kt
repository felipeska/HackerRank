package com.felipecb

import java.util.*

// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val a = 'a'
    val charactersValues = h.mapIndexed { index, value -> a + index to value }.toMap()
    val wordValues = word.map { char -> charactersValues[char] ?: 0 }
    val maxValue = wordValues.max() ?: 0
    return word.length * 1 * maxValue
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}
