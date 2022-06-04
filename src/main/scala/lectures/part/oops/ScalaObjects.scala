package lectures.part.oops

object ScalaObjects extends App {

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {

  }

  println(Person.N_EYES)
  println(Person.canFly)

  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person(mary, john)
}
