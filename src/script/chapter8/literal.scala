
// 関数リテラル
var increase = (x: Int) => x + 1
println(increase(1))

// 関数リテラル(複数行)
var increase2 = (x: Int) => {
  println("We")
  println("are")
  println("Here!")
  x + 1
}
println(increase2(10))

val sumNumber = List(-11,-10,-5,0,5,10)
sumNumber.foreach((x: Int) => println(x))

val filter = sumNumber.filter((x: Int) => x > 0)
println(filter)

// 省略 型推論
val filter2 = sumNumber.filter(x => x > 0)
println(filter2)

// プレースホルダー
val filter3 = sumNumber.filter(_ > 0)
println(filter3)