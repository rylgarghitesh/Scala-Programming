package lectures.part.oops

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${name} is hanging out with ${person.name}."
    def +(nickName: String) = new Person(s"$name ($nickName)", favouriteMovie)
    def unary_! : String = s"Not ${name} ?"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def apply() : String = s"Hi my name is ${name} and I like ${favouriteMovie} movie."
    def apply(n: Int) = s"$name watched $favouriteMovie $n times."
    def learns(thing: String) = s"$name is learning $thing"
    def learnScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")

  val tom = new Person("Tom", "Fight Club")
  println(mary.+(tom))
  println(mary + tom)
  println(!mary)
  println(mary())

  println((mary + "the Rock")())
  println(mary.learnScala)
  println(mary(10))
}
