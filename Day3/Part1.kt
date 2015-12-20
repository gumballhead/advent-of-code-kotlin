package com.adventofcode.day3

import java.util.HashSet

fun main(args: Array<String>) {
  val houses = HashSet<Point>()
  val santa = Point()

  readLine()?.forEach {
    santa.move(it)
    houses.add(santa.clone())
  }

  println(houses.size)
}
