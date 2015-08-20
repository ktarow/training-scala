
val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "World"

for(i <- 0 to 2)
  print(greetStrings(i))

// イディオム
val numNames = Array("zero", "one", "two")
