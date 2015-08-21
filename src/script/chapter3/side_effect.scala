
val args = Array("zero", "one", "two")

// 副作用があるコード(命令型)
def printArgs(args : Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

printArgs(args)

// 副作用が無いコード(関数型)

def formatArgs(args: Array[String]) = args.mkString("\n")

print(formatArgs(args))

val fa = formatArgs(args)
assert(fa == "zero\none\ntwo")