/**
  * Created by admin-k on 2016/5/17.
  */
trait Monoid[T] {
  def op(l: T, r: T): T
  def zero: T
}

package object monoids {
  val intAddition: Monoid[Int] = new Monoid[Int] {
    val zero: Int = 0
    override def op(l: Int, r: Int): Int = l + r
  }
  val intMultiplication: Monoid[Int] = new Monoid[Int] {
    val zero: Int = 1
    override def op(l: Int, r: Int): Int = l * r
  }
  val stringConcatenation: Monoid[String] = new Monoid[String] {
    val zero: String = ""
    override def op(l: String, r: String): String = l + r
  }
}
