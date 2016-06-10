
/**
  * Created by admin-k on 2016/5/17.
  */
import monoids._
object MonoidFolding {
  def main(args: Array[String]): Unit = {
    val strings = List("This is\n", "a list of\n", "strings!")
    val numbers = List(1, 2, 3, 4, 5, 6)

    println(s"Left folded:\n ${strings.foldLeft(stringConcatenation.zero)(stringConcatenation.op)}")

    println(s"Right folded:\n ${strings.foldRight(stringConcatenation.zero)(stringConcatenation.op)}")

    println(s"6! is: ${numbers.foldLeft(intMultiplication.zero)(intMultiplication.op)}")
  }
}






