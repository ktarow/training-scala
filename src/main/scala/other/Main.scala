package other

object Main {
  def main(args: Array[String]): Unit = {
    val parent: Parent = new Parent("main parent")
    val child: Child = new Child("main child")
    val parent_child: Parent = new Child("main parent_child")

    // 振る舞い=>親クラス 実装=>親クラス
    parent.echo()

    // 振る舞い=>子クラス 実装=>子クラス
    child.echo()
    child.onlyChild()

    // 振る舞い=>親クラス 実装=> 子クラス
    parent_child.echo()
  }
}
