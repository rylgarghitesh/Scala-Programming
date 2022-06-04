package exercises.oops

object SyntheticPatterns extends App {

  object Even {
    def unapply(arg: Int): Boolean = arg % 2 == 0
  }

  object SingleDigit {
    def unapply(arg: Int): Boolean = arg > -10 && arg < 10
  }

  val n: Int = 4
  val mathProperty = n match {
    case SingleDigit() => "single digit"
    case Even() => "an even number"
    case _ => "No property"
  }
  println(mathProperty)

}
