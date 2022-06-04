package lectures.part.basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + "- I first need factorial of " + (n-1) )
      val result = n * factorial(n-1)
      println("Computed factorial of " + n )
      result
    }

  def anotherFactorial(n: Int): BigInt = {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n, 1)
  }

  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailRec(aString, n-1, aString + " " + accumulator)

  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec( t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t-1, n%t != 0 && isStillPrime)

    isPrimeTailRec(n/2, true)
  }

  def fibonacci(n: Int): Int = {
    def fibonacciTailRec(t: Int, last: Int, nextToLast: Int): Int =
      if (t >= n) last
      else fibonacciTailRec(t+1, last + nextToLast, last)

    if (n <= 2) 1
    else fibonacciTailRec(2, 1, 1)
  }



//  println(factorial(10))
//  println(anotherFactorial(100))
//  println(concatenateTailRec("Hello", 3, ""))
//  println(isPrime(10))
//  println(isPrime(101))
//  println(fibonacci(10))
//  println(fibonacci(8))
}
