package lectures.part.synthetic

object AdvancedPatternMatching extends App {

  val numbers = List(1)
  val description = numbers match {
    case head :: Nil => println(s"the only element is $head.")
    case _ => println("The list has 2 or more element.")
  }

  class Person(val name: String, val age: Int)
  object Person {
    def unapply(person: Person): Option[(String, Int)] =
      if (person.age < 21)  None
      else Some((person.name, person.age))

    def unapply(age: Int): Option[String] =
      Some(if(age < 21) "Minor" else "Major")
  }

  val bob = new Person("Bob", 20)
  val greetings = bob match {
    case Person(n, a) => s"Hi, my name is $n and I am $a years old."
    case _ => s"No such person"
  }
  println(greetings)

  val legalStatus = bob.age match {
    case Person(status) => s"My legal status is $status"
  }
  println(legalStatus)

}
