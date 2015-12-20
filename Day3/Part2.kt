package com.adventofcode.day3

import java.util.HashSet

fun main(args: Array<String>) {
  val houses = HashSet<Point>()
  val santa = Point()
  val robot = Point()

  readLine()?.forEachIndexed() { i, it ->
    val point = if (i % 2 == 0) santa else robot
    point.move(it)
    houses.add(point.clone())
  }

  println(houses.size)
}
