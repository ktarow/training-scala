package chapter8
import scala.io.Source

object LongLines {
  def processFiles(filename: String, width: Int) = {
    def processLine(line: String): Unit = {
      if (line.length > width) {
        println(filename + " : " + line.trim)
      }
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}
