package lectures.part.oops

object AbstractDataTypes extends App {

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("Crunch Crunch")
  }

  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "Croc"
    override def eat: Unit = println("NomNom")
    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}.")
  }

  val dog = new Dog
  val crocodile = new Crocodile
  crocodile.eat(dog)
  crocodile eat dog
}
