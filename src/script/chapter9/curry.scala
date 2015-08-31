
// 通常の関数
def plainOldSum(x: Int, y: Int) = x + y

println(plainOldSum(1,2))

// カリー化したメソッド
def curriedSum(x: Int)(y: Int) = x + y

val cu = curriedSum(1)_
println(cu(2))