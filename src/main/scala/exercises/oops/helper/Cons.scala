package exercises.oops.helper

case class Cons[+A](hd: A, tl: MyList[A]) extends MyList[A] {
  def head: A = hd
  def tail: MyList[A] = tl
  def isEmpty: Boolean = false
  def add[B >: A](element: B): MyList[B] = new Cons(element, this)
  def ++[B >: A](list: MyList[B]): MyList[B] = new Cons[B](hd, tl ++ list)

  def printElement: String =
    if (tl.isEmpty) "" + hd
    else hd + " " + tl.printElement

  def map[B](transform: A => B): MyList[B] =
    new Cons[B](transform(hd), tl.map(transform))

  def flatMap[B](transform: A => MyList[B]): MyList[B] =
    transform(hd) ++ tl.flatMap(transform)

  def filter(predicate: A => Boolean): MyList[A] =
    if (predicate(hd)) new Cons(hd, tl.filter(predicate))
    else tl.filter(predicate)
}
