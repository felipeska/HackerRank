package com.felipecb

fun main() {

}

fun bomberMan(n: Int, grid: Array<String>): Array<String> {
  if (n == 0 || n == 1) return grid

  return when (n % 4) {
    1 -> intermediate(intermediate(grid))
    3 -> intermediate(grid)
    else -> fullGrid(grid)
  }

}

fun intermediate(grid: Array<String>): Array<String> {
  val result = Array(grid.size) { i ->
    var partial = ""
    for (j in 0 until grid[i].length) {
      val hasBomb = nearBomb(grid, i, j)
      partial += if (hasBomb) {
        "."
      } else {
        "O"
      }

    }
    return@Array partial
  }
  return result
}

fun fullGrid(grid: Array<String>): Array<String> {
  val result = Array(grid.size) { i ->
    var partial = ""
    for (j in 0 until grid[i].length) {
      partial += "O"
    }
    return@Array partial
  }
  return result
}

fun nearBomb(grid: Array<String>, i: Int, j: Int): Boolean {
  val topValue = grid.getOrNull(i - 1)?.getOrNull(j)
  if (topValue == 'O') return true
  val bottomValue = grid.getOrNull(i + 1)?.getOrNull(j)
  if (bottomValue == 'O') return true
  val leftValue = grid.getOrNull(i)?.getOrNull(j - 1)
  if (leftValue == 'O') return true
  val rightValue = grid.getOrNull(i)?.getOrNull(j + 1)
  if (rightValue == 'O') return true
  val sameValue = grid.getOrNull(i)?.getOrNull(j)
  if (sameValue == 'O') return true
  return false
}
