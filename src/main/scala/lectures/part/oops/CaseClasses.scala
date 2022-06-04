package lectures.part.oops

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  val jim = Person("Jim", 45)
  println(jim)

  val jim2 = Person("Jim", 45)
  println(jim2)

  println(jim == jim2)

  val jim3 = jim.copy(age = 30)
  println(jim3)

  val thePerson = Person
  println(thePerson)

  val mary = Person("Mary", 25)
  println(mary)
}
