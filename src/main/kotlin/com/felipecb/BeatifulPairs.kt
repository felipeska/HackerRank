package com.felipecb

fun main(){

}

fun beautifulPairs(A: Array<Int>, B: Array<Int>) : Int {
  var sumA = 0
  var sumB = 0
  var result = 0

  val a = A.sorted()
  val  b = B.sorted()

  while (a.size > sumA && b.size > sumB) {
    if(a[sumA] == b[sumB]) {
      sumA += 1
      sumB += 1
      result += 1
      continue
    }

    if (a[sumA] > b[sumB]) {
      sumB += 1
      continue
    }

    sumA += 1
  }
  return if (result < a.size) result+1 else result-1
}
