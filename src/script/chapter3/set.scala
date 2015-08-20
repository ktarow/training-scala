
// 不変なSet
var jetSet = Set("Boeing", "Airbus")
// 再代入する
jetSet += "Lear"
println(jetSet.contains("Cessna"))

// 可変なSet. importが必要
import scala.collection.mutable.Set
val movieSet = Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)
