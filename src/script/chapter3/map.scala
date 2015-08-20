
// 不変なMap
val romanNumeral = Map(
  1 -> "I",
  2 -> "II",
  3 -> "III",
  4 -> "IV"
)
println(romanNumeral(2))

// 可変なMap
import scala.collection.mutable.Map
val treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))
