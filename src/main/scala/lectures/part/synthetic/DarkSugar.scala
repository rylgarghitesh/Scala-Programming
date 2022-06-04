package lectures.part.synthetic

import scala.util.Try

object DarkSugar extends App {

  def singleArgMethod(arg: Int): String = s"$arg little ducks...."
  val description = singleArgMethod {
    42
  }
  println(description)

  val aTryInstance = Try {
    throw new RuntimeException
  }

  List(1,2,3).map {
    x => x + 1
  }

  trait Action {
    def act(x: Int): Int
  }

  val anInstance: Action = new Action {
    override def act(x: Int): Int = x + 1
  }

  val aFunkyInstance: Action = (x: Int) => x + 1

  val aThread = new Thread(new Runnable {
    override def run(): Unit = println("Hello Scala")
  })
//  println(aThread)

  val aSweeterThread = new Thread( () => println("Sweet, Scala"))
//  println(aSweeterThread)

  abstract class AnAbstractType {
    def implemented: Int = 23
    def f(a: Int): Unit
  }

  val anAbstractInstance: AnAbstractType = (a: Int) => println("sweet")
//  println(anAbstractInstance)

  val prependedList = 2 :: List(3, 4)
  println(prependedList)

  println(1 :: 2 :: 3 :: List(4, 5))

  class MyStream[T] {
    def -->:(value: T) = this
  }

  val myStream = 1 -->: 2 -->: 3 -->: new MyStream[Int]
//  println(myStream)


  class TeenGirl(name: String) {
    def `and then said`(gossip: String) = println(s"$name said $gossip")
  }

  val lilly = new TeenGirl("Lilly")
  lilly.`and then said`("Scala is so good")
  lilly `and then said` "Scala is so sweet"

  class Composite[A, B]
  val composite: Int Composite String = new Composite[Int, String]

  class -->[A, B]
  val towards: Int --> String = new -->[Int, String]

  val anArray = Array(1, 2, 3, 4)
  anArray(2) = 7
  anArray.update(3,6)
  println(anArray.toList)

  class Mutable {
    private var internalMember: Int = 0
    def member = internalMember
    def member_=(value: Int) = internalMember = value
  }

  val mutable = new Mutable
  mutable.member = 42
  println(mutable.member)
}
