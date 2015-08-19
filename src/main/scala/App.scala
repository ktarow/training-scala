package com.example.trainingscala

object App {
  val str = "String"
  def main(args: Array[String]) {
    println("Hello com.example.training-scala!")
    println(str)

    println(max(5,2))
    println(max(2,5))
    greet()
  }

  // 基本
  def max(x: Int, y: Int): Int = {
    if(x > y) x
    else y
  }

  // 省略
  def max2(x: Int, y: Int) = if(x > y) x else y

  // 返り値に意味を持たない関数. Unit型(Javaで言うvoid)を返す
  def greet() = println("Hello World")
}
