package lectures.part.patterns

import scala.util.Random

object PatternMatching extends App {

  val random = new Random
  val x = random.nextInt(10)

  val description = x match {
    case 1 => "the one"
    case 2 => "the double"
    case 3 => "the third"
    case _ => "something else"
  }

    println(x)
    println(description)

    case class Person(name: String, age: Int)
    val bob = Person("Bob", 25)

    val greeting = bob match {
      case Person(n, a) if a < 21 => s"Hi, my name is $n and I can't drink."
      case Person(n, a) => s"Hi, my name is $n and I am $a years old."
      case _ => "I don't know."
    }

    println(greeting)

  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greetings: String) extends Animal

  val animal: Animal = Dog("Terra")
  animal match {
    case Dog(someBreed) => println(s"Matched a dog of $someBreed breed.")
  }

  trait Expr
  case class Number(n: Int) extends Expr
  case class Sum(e1: Expr, e2: Expr) extends Expr
  case class Prod(e1: Expr, e2: Expr) extends Expr

  def show(e: Expr): String = e match {
    case Number(n) => s"$n"
    case Sum(e1, e2) => show(e1) + " + " + show(e2)
    case Prod(e1, e2) => {
      def maybeShowParentheses(expr: Expr) = expr match {
        case Prod(_, _) => show(expr)
        case Number(_) => show(expr)
        case _ => "(" + show(expr) + ")"
      }

      maybeShowParentheses(e1) + " * " + maybeShowParentheses(e2)
     }
  }

  println(show(Sum(Number(2), Number(3))))
  println(show(Sum(Sum(Number(2), Number(3)), Number(4))))
  println(show(Prod(Sum(Number(2), Number(3)), Number(4))))
  println(show(Sum(Prod(Number(2), Number(3)), Number(4))))



}
