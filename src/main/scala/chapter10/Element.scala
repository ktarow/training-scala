package chapter10

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
  def width: Int = if (height == 0) 0 else contents(0).length

  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)

  def beside(that: Element): Element = {
    val contents = new Array[String](this.contents.length)
    new ArrayElement(
      for (
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  }

  override def toString = contents mkString "\n"
}
