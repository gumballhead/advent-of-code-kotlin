package com.adventofcode.day4

fun main(args: Array<String>) {
  val result = HashIterator(args[0]).asSequence().indexOfFirst {
    println(it)
    it.startsWith("00000")
  }

  println("answer is " + result)
}
