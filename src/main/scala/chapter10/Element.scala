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
}
