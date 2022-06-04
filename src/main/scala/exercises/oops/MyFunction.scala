package exercises.oops

object MyFunction extends App {

  def concatenator: (String, String) => String = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = a + " " +  b
  }

  println(concatenator("Hello", "World"))

  val superAdder: Function1[Int, Function1[Int,Int]] = new Function1[Int, Function1[Int,Int]] {
    override def apply(x: Int): Function1[Int,Int] = new Function1[Int,Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(6))
}
