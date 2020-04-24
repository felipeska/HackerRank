package com.codejam

fun evaluate(case: Int, size: Int, matrix: Array<Array<Int>>): String {
    var trace = 0
    var repeatedInRows = 0
    var repeatedInColumns = 0
    for (i in 0 until size) {
        for (j in 0 until size) {
            if (i == j) {
                trace += matrix[i][j]
            }
        }
    }
    for (array in matrix) {
        for (value in array) {
            repeatedInRows = array.groupingBy { it }.eachCount().filter { it.value > 1 }.maxBy { it.value }?.value ?: 0
        }
    }
    var tempMatrix = arrayOf<Array<Int>>()
    for (j in matrix[0].indices) {
        var array = arrayOf<Int>()
        for (i in matrix.indices) {
            array += matrix[i][j]
        }
        tempMatrix += array
    }
    for (array in tempMatrix) {
        for (value in array) {
            repeatedInColumns =
                array.groupingBy { it }.eachCount().filter { it.value > 1 }.maxBy { it.value }?.value ?: 0
        }
    }

    return "Case #$case: $trace $repeatedInRows $repeatedInColumns"
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()
    for (tItr in 1..t) {
        val size = readLine()!!.trim().toInt()
        var matrix = arrayOf<Array<Int>>()
        for (i in 1..size) {
            var array = arrayOf<Int>()
            array = readLine()!!.split(" ").map { it.trim().toInt() }.toTypedArray()
            matrix += array
        }
        val result = evaluate(tItr, size, matrix)
        println(result)
    }
}
