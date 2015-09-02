package other

class Child(val child: String) extends Parent("parent") {
  override def echo() : Unit = {
    println(child)
  }

  def onlyChild() : Unit = {
    println(child)
  }
}
