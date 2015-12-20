package com.adventofcode.day3

data class Point(private var x: Int = 0, private var y: Int = 0): Cloneable {

  public fun left() {
    x--
  }

  public fun up() {
    y++
  }

  public fun right() {
    x++
  }

  public fun down() {
    y--
  }

  public fun move(direction: Char) {
    when (direction) {
      '<' -> left()
      '^' -> up()
      '>' -> right()
      'v' -> down()
    }
  }

  override public fun clone(): Point {
    return Point(x, y)
  }
}
