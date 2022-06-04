package exercises.oops.helper

abstract class MyList[+A] {
  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyList[B]
  def printElement: String
  override def toString: String = "[" + printElement + "]"
  def map[B] (transform: A => B): MyList[B]
  def flatMap[B](transform: A => MyList[B]): MyList[B]
  def filter(predicate: A => Boolean): MyList[A]
  def ++[B>:A](list: MyList[B]): MyList[B]
}






