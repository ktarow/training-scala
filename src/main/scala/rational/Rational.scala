package com.example.trainingscala.rational

class Rational(n: Int, d: Int) {
  require(d != 0)
  val number: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1)

  override def toString = n + "/" + d

  def add(that: Rational): Rational = {
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )
  }

  def lessThan(that: Rational) =
    this.number * that.denom < that.number * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this
}

