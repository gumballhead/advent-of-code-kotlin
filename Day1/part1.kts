val result = readLine()?.sumBy {
  when (it) {
    '(' -> 1
    ')' -> -1
  }
} ?: 0

println(result)
