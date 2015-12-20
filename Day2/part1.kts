val result = System.`in`.bufferedReader().lineSequence().sumBy {
  val (l, w, h) = it.split('x').map(String::toInt)
  val x = l * w
  val y = w * h
  val z = h * l

  2 * (x + y + z) + Math.min(Math.min(x, y), z)
}

println(result)