// 可変長引数
def echo(args: String*): Unit = {
  for (arg <- args) println(arg)
}

echo()
echo("hoge")
echo("hoge", "fuga")

// 展開
val arr = Array("What's", "up", "doc")
echo(arr: _*)

// 名前付き引数
def speed(distance: Float, time: Float): Float = {
  distance / time
}

println(speed(100, 10))

println(speed(time = 10, distance = 100))

// デフォルトパラメータ
def printTime(out: java.io.PrintStream = Console.out) = {
  out.println("time = " + System.currentTimeMillis())
}

printTime()

//
def printTime2(out: java.io.PrintStream = Console.out,
                divisor: Int = 1) = {
  out.println("time = " + System.currentTimeMillis()/divisor)
}

printTime2(divisor = 1000)
