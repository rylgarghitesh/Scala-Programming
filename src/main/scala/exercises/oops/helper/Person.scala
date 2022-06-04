package exercises.oops.helper

class Person(name: String, val age: Int = 0) {
  val x = 2
  println(1 + 3)

  def greet(name: String) =
    println(s"${this.name} says: Hi, $name")

  def this(name: String) = this(name, 0)
  def this() = this("John")
}

