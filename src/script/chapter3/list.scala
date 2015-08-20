
val oneTwo = List(1,2)
val threeFour = List(3,4)

val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println(oneTwoThreeFour)

val twoThree = List(2,3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)
// 1 :: twoThreeのようにメソッドの最後が:(コロン)で終わっているものは右被演算子から呼び出される

// メソッド群
val thrill = "Will" :: "fill" :: "untill" :: Nil
// カウント
thrill.count( s => s.length == 4)
// 先頭の要素を取り除いた新しいリストを返す
thrill.drop(2)
// 末尾
thrill.dropRight(2)
// 要素が存在するか
thrill.exists(s => s == "util;")
// フィルター
thrill.filter(s => s.length == 4)
// 末尾
thrill.forall(s => s.endsWith("l"))
// ループ
thrill.foreach(s => println(s))
// 上記の完結
thrill.foreach(print)
// 先頭要素
thrill.head
// 末尾の要素を取り除いたもの
thrill.init
// 空かチェック
thrill.isEmpty
// 最後の要素
thrill.last
// 要素数
thrill.length
// 要素に処理をしたあと新たなListを返す
thrill.map( s => s + "y")
// 逆順
thrill.reverse
// 先頭要素をとりのぞいたList
thrill.tail
