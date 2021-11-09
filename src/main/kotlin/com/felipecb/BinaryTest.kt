package com.felipecb

import java.util.Stack

fun main() {
  println(solve("()"))
  println(solve("(("))
  println(solve("[()]"))
  println(solve("()()[]"))
  println(solve("[([)[]]]"))
  println(solve(""))
  println(solve("[[[["))
}

fun solve(s: String): Boolean {
  val openA = '['
  val closedA = ']'
  val openB = '('
  val closedB = ')'
  val stack = Stack<Char>()

  s.forEach { letter ->
    if (letter == openA || letter == openB) {
      stack.add(letter)
    } else if (letter == closedA || letter == closedB) {
      if (isOpposite(stack.last(), letter)) {
        stack.pop()
      }
    }
  }
  return stack.empty()
}

fun isOpposite(c: Char, o: Char): Boolean {
  val openA = '['
  val closedA = ']'
  val openB = '('
  val closedB = ')'
  return if (c == openA && o == closedA) {
    true
  } else c == openB && o == closedB
}