import kotlin.text.Regex

val pairs = Regex("(\\p{Alpha}{2}).*\\1+")
val split = Regex("(\\p{Alpha})\\p{Alpha}\\1")

val result = System.`in`.bufferedReader().lineSequence().count {
  pairs.containsMatchIn(it) && split.containsMatchIn(it)
}

println(result)
