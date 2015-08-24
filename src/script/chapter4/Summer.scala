package chapter4
import ChecksumAccumulatro.calculate
object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}