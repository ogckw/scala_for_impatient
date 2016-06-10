/**
  * Created by admin-k on 2016/5/17.
  */
object MonoidOperations {
  def fold[T](list: List[T], m: Monoid[T]): T =
    list.foldLeft(m.zero)(m.op)
}
