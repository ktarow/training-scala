package chapter8
import scala.io.Source

object LongLines {
  def processFiles(filename: String, width: Int) = {
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }

  private def processLine(filename: String, width: Int, line: String): Unit = {
    if (line.length > width) {
      println(filename + " : " + line.trim)
    }
  }
}
