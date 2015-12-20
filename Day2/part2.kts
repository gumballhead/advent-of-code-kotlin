val result = System.`in`.bufferedReader().lineSequence().sumBy {
  val (l, w, h) = it.split('x').map(String::toInt).toIntArray().sortedArray()
  2 * (l + w) + l * w * h
}

println(result)
