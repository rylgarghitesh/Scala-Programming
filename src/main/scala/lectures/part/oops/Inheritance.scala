package lectures.part.oops

object Inheritance extends App {

  class Animal {
    val creatureType: String = "Wild"
    def eat: Unit = println("nomnom")
  }

  class Cat extends Animal {
    def crunch: Unit = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Dog extends Animal {
    override val creatureType: String = "Domestic"
    override def eat: Unit = println("crunch crunch")
  }

  val dog = new Dog()
  dog.eat
  println(dog.creatureType)

  val unknownAnimal: Animal = new Dog()
  unknownAnimal.eat

}
