package com.felipecb

fun main() {
  taumBday(0, 0, 0, 0, 0)
}

fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
  // Write your code here
  var rbc = bc.toLong()
  if(wc* z < bc ) {
    rbc = (bc + z).toLong()
  }

  var rwc = wc.toLong()
  if(wc* z < wc ) {
    rwc = (bc + z).toLong()
  }

  return ((b * rbc) +(w * rwc)).toLong()
}
