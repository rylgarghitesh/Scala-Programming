package exercises.oops

import exercises.oops.helper.{Cons, Empty, MyList}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.head)
  println(list.tail.head)
  println(list.tail.tail.head)
  println(list.toString)

  val listOfInt: MyList[Int] = new Cons[Int](1,new Cons[Int](2, new Cons[Int](3, Empty)))
  val listOfString: MyList[String] = new Cons[String]("Hello", new Cons[String]("Scala", Empty))
  val anotherListOfInt: MyList[Int] = new Cons[Int](1,new Cons[Int](2, new Cons[Int](3, Empty)))

  println(listOfInt.toString)
  println(listOfString.toString)
  println(listOfInt.map(_ * 2).toString)
  println(listOfInt.filter(_ % 2 == 0).toString)
  println((listOfInt ++ anotherListOfInt).toString)
  println(listOfInt.flatMap(element => new Cons[Int](element, new Cons[Int](element + 1, Empty))).toString)
}
