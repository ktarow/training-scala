package chapter10

object Element {
  private class ArrayElement(val contents: Array[String]) extends Element {
  }
  private class LineElement(s: String) extends Element {
    override def width = s.length
    override def height = 1
    val contents = Array(s)
  }
  private class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }

  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)
  def elem(ch: Char, width: Int, height: Int): Element =
    new UniformElement(ch, width, height)
  def elem(line: String): Element =
    new LineElement(line)
}

import Element.elem
// 抽象クラス
// インスタンスを作成することはできない
abstract class Element {
  def contents: Array[String]

  /*
    統一形式アクセスの法則: 属性をフィールドとメソッドのどちらで実装するかによってクライアントコードが影響を受けてはならない
    パラメータなしメソッドを定義
    一般に副作用を起こすメソッドには空カッコを，副作用のないメソッドはパラメータなしメソッドを書く
   */
  def height: Int = contents.length
  def width: Int = contents(0).length

  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents)
  }
  def beside(that: Element): Element = {
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(
      for ((line1, line2) <- this1.contents zip that1.contents)
        yield line1 + line2
    )
  }

  def widen(w: Int): Element = {
    if (w <= width) this
    else {
      val left = elem(' ', (w - width)/2 , height)
      val right = elem(' ', w- width - left.width, height)
      left beside this beside right
    }
  }

  def heighten(h: Int): Element = {
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height)/2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }
  }

  override def toString = contents mkString "\n"
}
