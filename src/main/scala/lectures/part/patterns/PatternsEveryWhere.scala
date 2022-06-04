package lectures.part.patterns

object PatternsEveryWhere extends App {

  try {

  } catch {
    case e: RuntimeException => "runtime"
    case npe: NullPointerException => "npe"
    case _ => "something else"
  }

  val list = List(1, 2, 3, 4)
  val evenOne = for {
    x <- list if x % 2 == 0
  } yield 10 * x
  println(evenOne)

  val tuples = List((1, 2), (3, 4))
  val filterTuple = for {
    (first, second) <- tuples
  } yield first * second
  println(filterTuple)

  val tuple = (1, 2, 3)
  val (a, b, c) = tuple
  println(b)

  val head :: tail = list
  println(head)
  println(tail)

  val mappedList = list.map {
    case v if v % 2 == 0 => v + " is even"
    case 1 => "the One"
    case _ => "something else"
  }
  println(mappedList)

}
