// 関数型スタイル
args.foreach(arg => println(arg))

// 型を明示する
args.foreach((arg: String) => println(arg))

// 略記法
args.foreach(println)