var floor = 0

val result = readLine()?.indexOfFirst {
  when (it) {
    '(' -> floor++
    ')' -> floor--
  }

  floor < 0
} ?: 0

println(result + 1)
