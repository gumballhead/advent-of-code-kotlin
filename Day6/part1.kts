import java.util.BitSet
import kotlin.text.Regex

val TURN_ON = "turn on"
val TURN_OFF = "turn off"
val TOGGLE = "toggle"

val coordinates = Regex("\\d+")
val size = 1000
val lights = BitSet(size * size)

System.`in`.bufferedReader().lineSequence().forEach {
  val (x0, y0, x1, y1) = coordinates.findAll(it).map { it.value.toInt() }.toArrayList()

  for (y in y0..y1) {
    val row = size * y
    val start = row + x0
    val end = row + x1 + 1

    when {
      it.startsWith(TURN_ON) -> lights.set(start, end)
      it.startsWith(TURN_OFF) -> lights.clear(start, end)
      it.startsWith(TOGGLE) -> lights.flip(start, end)
    }
  }
}

println(lights.cardinality())
