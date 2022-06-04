package lectures.part.function

object AnonymousFunction extends App {

  val doubler: Int => Int = (x: Int) => x * 2
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b
  val justDoSomething: () => Int = () => 3

  println(justDoSomething)
  println(justDoSomething())

  val stringToInt = {
    (str: String) => str.toInt
  }

  val niceIncrementer: Int => Int = _ + 1
  val niceAdder: (Int, Int) => Int = _ + _

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
