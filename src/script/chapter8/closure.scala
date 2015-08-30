
var more = 1

// 束縛変数
val sum1 = (x: Int) => x + 1

// 自由変数
val sum2 = (x: Int) => x + more

println(sum1(1))
println(sum1(2))

// 関数オブジェクトを返すメソッド
def sum(more: Int) = (x: Int) => more + x

// sumメソッドの返す関数オブジェクト自身が，引数の値を保持している
val hoge = sum(1)
val fuga = sum(9999)

println(hoge(1))
println(fuga(1))
