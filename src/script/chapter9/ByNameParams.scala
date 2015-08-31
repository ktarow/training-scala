
var assertionsEnabled = true

def myAssert(predicate: => Boolean) = {
  if (assertionsEnabled && !predicate)
    throw new AssertionError()
}

// 引数として渡される関数値は，遅延評価される
myAssert(5 > 3)
