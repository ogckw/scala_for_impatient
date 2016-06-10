/**
  * Created by admin-k on 2016/5/17.
  */
import monoids._
object MonoidFoldingGeneric {
  def main(args: Array[String]): Unit = {
    val strings = List("This is\n", "a list of\n", "strings!")
    val numbers = List(1, 2, 3, 4, 5, 6)
    println(s"Left folded:\n ${MonoidOperations.fold(strings, stringConcatenation)}")
    println(s"Right folded:\n ${MonoidOperations.fold(strings, stringConcatenation)}")
    println(s"6! is: ${MonoidOperations.fold(numbers, intMultiplication)}")
  }
}
