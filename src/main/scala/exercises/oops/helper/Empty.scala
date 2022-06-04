package exercises.oops.helper

case object Empty extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)
  def printElement: String = ""
  def map[B](transform: Nothing => B): MyList[B] = Empty
  def flatMap[B](transform: Nothing => MyList[B]): MyList[B] = Empty
  def filter(predicate: Nothing => Boolean): MyList[Nothing] = Empty
  def ++[B >: Nothing](list: MyList[B]): MyList[B] = list
}
