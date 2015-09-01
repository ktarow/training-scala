package chapter10

class LineElement(s: String) extends ArrayElement(Array(s)) {
  // 具象メンバーを実装する場合には，override修飾子は必須
  // 抽象メンバーは任意
  override def width = s.length
  override def height = 1
}
