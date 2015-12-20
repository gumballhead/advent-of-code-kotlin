import kotlin.text.Regex

val vowels = Regex("[aeiou]")
val doubles = Regex("(\\p{Alpha})\\1+")
val forbidden = Regex("ab|cd|pq|xy")

val result = System.`in`.bufferedReader().lineSequence().count {
  vowels.findAll(it).count() >= 3 && doubles.containsMatchIn(it) && !forbidden.containsMatchIn(it)
}

println(result)
