package com.felipecb

fun main() {
  println(repeatedString("aba", 10))
  //println(repeatedString("gfcaaaecbg", 547602))
  //println(repeatedString("ceebbcb", 817723))
  //println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570))
}

// aba aba aba a
fun repeatedString(s: String, n: Long): Long {
  val countReps = s.count { it == 'a' }
  val countTotal = (n / s.length ) * countReps
  val countRes = s.substring(0,(n % s.length).toInt()).count { it == 'a' }
  return countTotal + countRes
}