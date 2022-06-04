package lectures.part.basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aParameterlessFunction(): Int = 42

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n-1)
  }

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n - 1)
  }

  def greetingForKid(name: String, age: Int): String =
    "Hi, my name is " + name + ", and my age is " + age

  def factorial(n: Int): Int =
    if (n <= 0) 1 else n*factorial(n-1)

  def fibonacci(n: Int): Int =
    if (n <= 1) 1 else fibonacci(n-1) + fibonacci(n-2)

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t == 1) true else n%t !=0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }


  println(aFunction("Hello", 2))
  println(aParameterlessFunction)
  println(aRepeatedFunction("Hello", 3))
  println(aFunctionWithSideEffects("Hello"))
  println(aBigFunction(10))
  println(greetingForKid("King", 20))
  println(factorial(10))
  println(fibonacci(10))
  println(isPrime(10))

}
