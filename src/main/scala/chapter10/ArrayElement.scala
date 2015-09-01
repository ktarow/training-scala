package chapter10

class ArrayElement(val params: Array[String]) extends Element {
  def contents: Array[String] = params

  // Scalaはフィールドとメソッドで名前空間を共有している
  // 親クラスで定義されているメソッドをフィールドにオーバーライドすることも可能
  // (例) val contents: Array[String] = conts
}

