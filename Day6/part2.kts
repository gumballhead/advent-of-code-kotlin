import kotlin.text.Regex

val TURN_ON = "turn on"
val TURN_OFF = "turn off"
val TOGGLE = "toggle"

val coordinates = Regex("\\d+")
val size = 1000
val lights = IntArray(size * size)

System.`in`.bufferedReader().lineSequence().forEach {
  val (x0, y0, x1, y1) = coordinates.findAll(it).map { it.value.toInt() }.toArrayList()

  for (y in y0..y1) {
    val row = y * size

    for (i in row + x0..row + x1) {
      when {
        it.startsWith(TURN_ON) -> lights[i]++
        it.startsWith(TURN_OFF) -> if (lights[i] > 0) lights[i]--
        it.startsWith(TOGGLE) -> lights[i] += 2
      }
    }
  }
}

println(lights.sum())
