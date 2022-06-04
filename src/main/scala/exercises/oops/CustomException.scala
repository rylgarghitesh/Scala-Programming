package exercises.oops

object CustomException extends App {

  case class OverflowException(string: String) extends RuntimeException(string)
  case class UnderflowException(string: String) extends RuntimeException(string)
  case class MathCalculationException(string: String) extends RuntimeException(string)

  object PocketCalculator {
    def add(x: Int, y: Int) = {
      val result = x + y

      if(x > 0 && y > 0 && result < 0) throw new OverflowException("Overflow occurred")
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException("Underflow occurred")
      result
    }

    def subtract(x: Int, y: Int) = {
      val result = x - y

      if(x > 0 && y < 0 && result < 0) throw new OverflowException("Overflow occurred")
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException("Underflow occurred")
      result
    }

    def multiply(x: Int, y: Int) = {
      val result = x * y

      if(x > 0 && y > 0 && result < 0) throw new OverflowException("Overflow occurred")
      else if (x < 0 && y < 0 && result < 0) throw new OverflowException("Overflow occurred")
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowException("Underflow occurred")
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException("Underflow occurred")
      result
    }

    def divide(x: Int, y: Int) = {

      if(y == 0) throw new MathCalculationException("Division By 0")
      x / y
    }
  }


//  println(PocketCalculator.add(Int.MaxValue,10))
//  println(PocketCalculator.subtract(Int.MinValue, 10))
//  println(PocketCalculator.divide(2,0))

}
