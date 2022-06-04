package lectures.part.patterns

import exercises.oops.helper.{Cons, Empty, MyList}
import exercises.oops.helper

object AllThePatterns extends App {

  val x: Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "The Scala"
    case true => "The truth"
    case AllThePatterns => "An object"
  }
  println(constants)

  val matchAnything = x match {
    case _ => ""
  }

  val matchAVariable = x match {
    case something => s"I've found $something"
  }
  println(matchAVariable)

  val aTuple = (1,2)
  val matchATuple = aTuple match {
    case (1, 1) => "Good morning"
    case (something, 2) => s"I've found $something"
  }
  println(matchATuple)

  val nestedTuple = (1, (2, 3))
  val matchANestedTuple = nestedTuple match {
    case (_, (2, v)) =>  "nested Tuple"
  }
  println(matchANestedTuple)

  val aList: MyList[Int] = Cons(1, helper.Cons(2, Empty))
  val matchAList = aList match {
    case Empty => "Empty List"
//    case Cons(hd, tl) => "A head and tail"
    case Cons(head, Cons(subHead, subTail)) => "Full List"
  }
  println(matchAList)

  val aStandardList = List(1, 2, 3, 42)
  val matchAStandardList = aStandardList match {
    case List(1, _, _, _) => "extractor"
    case List(1, _*) => "list of arbitrary length"
    case 1 :: List(_) => "Infix pattern"
    case List(1, 2, 3) :+ 42 => "Infix pattern"
  }
  println(matchAStandardList)

  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] => "explicit type specifier"
    case _ => "all matching"
  }
  println(unknownMatch)

  val nameBindingMatch = aList match {
    case nonEmptyList @ Cons(_, _) => "name binding use name later"
    case Cons(1, rest @ Cons(2, _)) => "name binding inside nested pattern"
  }
  println(nameBindingMatch)

  val multiPattern = aList match {
    case Empty | Cons(0, _) => "Compound pattern"
    case _ => "Not a match"
  }
  println(multiPattern)

  val secondElementSpecial = aList match {
    case Cons(_, Cons(specialElement, _)) if specialElement % 2 == 0 => "second element special"
  }
  println(secondElementSpecial)

  val numbers = List(1, 2, 3)
  val numbersMatch = numbers match {
    case listOfStrings: List[String] => "a list of strings"
    case listOfNumbers: List[Int] => "a list of numbers"
    case _ => ""
  }
  println(numbersMatch)

}
