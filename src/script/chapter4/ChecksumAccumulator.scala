package chapter4

import scala.collection.mutable.Map
object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String): Int  = {
    if(cache.contains(s)) {
      cache(s)
    }else{
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add3(c.toByte)
      val cs = acc.checksum2()
      cache += (s -> cs)
      cs
    }
  }
}

// コンパニオンクラス
class ChecksumAccumulator {
  // デフォルトはpublic
  var sum = 0
  private var sum2 = 0

  // デフォルトで引数は，val
  def add(b: Byte): Unit = {
    sum2 += b
  }

  // returnは書かない方が望ましい
  def checksum(): Int = {
    return ~(sum2 & 0xFF) + 1
  }

  def add2(b: Byte): Unit = sum2 += b

  // 副作用を起こす関数(結果型がUnit)は，結果型を省略し，中括弧でくくる
  // 等号を省略すると，全てUnit型になってしまうため，返り値がUnit型でないものを返す時は等号が必須
  def add3(b: Byte) { sum2 += b}

  def checksum2(): Int = ~(sum2 & 0xFF) + 1
}

val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator

// 別オブジェクトの再代入は不可だが，オブジェクトの状態は変更可能
csa.sum = 1
// オブジェクトの状態を変更することを明示的に不可能に
// csa.sum2 = 2 (コンパイルエラー)

ChecksumAccumulator.calculate("Every value is an object.")
