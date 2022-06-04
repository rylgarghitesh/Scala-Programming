package lectures.part.oops

object Generics extends App {

  class MyList[A]{
    def add[B >: A](element: B): MyList[B] = new MyList[B]
  }

  trait MyMap[Key, Value]

  val listOfInt = new MyList[Int]
  val listOfString = new MyList[String]

  object MyList {
    def empty[A]: MyList[A] = new MyList[A]
  }

  val emptyListOfInteger = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  class CovariantList[+A] {
    val animal: Animal = new Cat
    val animalList: CovariantList[Animal] = new CovariantList[Cat]
  }

  class InvariantList[A] {
    val animalList: InvariantList[Animal] = new InvariantList[Animal]
  }

  class Trainer[-A] {
    val trainerList: Trainer[Cat] = new Trainer[Animal]
  }

  class Cage[A <: Animal](animal: A){
    val cage = new Cage(new Dog)
  }
}
