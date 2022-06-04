package lectures.part.oops

object AnonymousClasses extends App {

  abstract class Animal {
    def eat
  }

  val  funnyAnimal = new Animal {
    override def eat: Unit = println("hahahahah")
  }

  println(funnyAnimal.getClass)

  class Person(name:String) {
    def sayHi = println(s"Hi my name is $name")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = super.sayHi
  }.sayHi



}
