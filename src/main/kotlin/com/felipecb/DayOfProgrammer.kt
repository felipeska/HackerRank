package com.felipecb

//https://www.hackerrank.com/challenges/day-of-the-programmer/problem

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    val months = mutableListOf(
        31,
        28,
        31,
        30,
        31,
        30,
        31,
        31,
        30,
        31,
        30,
        31
    )
    if (year in 2700 downTo 1700) {
        if (year < 1919) {
            if (year == 1918) {
                months[1] = 15
            } else {
                if (year % 4 == 0) {
                    months[1] = 29
                } else {
                    months[1] = 28
                }
            }
        } else {
            if ((year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))) {
                months[1] = 29
            } else {
                months[1] = 28
            }
        }

        var days = 0
        var month = 0
        for (index in months.indices) {
            if (days + months[index] <= 256) {
                days += months[index]
                month = index + 2
                print("month: $index: ${months[index]}\t")
            }
        }
        val programmerDay = 256 - days
        val stringProgrammerDay = if (programmerDay <= 9) "0$programmerDay" else programmerDay.toString()
        val stringMonth = if (month <= 9) "0$month" else month.toString()
        print("$stringProgrammerDay.$stringMonth.$year")
    }
    return ""
}

fun isLeap(y: Long): Boolean = y and 3 == 0L && (y % 100 != 0L || y % 400 == 0L)

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
