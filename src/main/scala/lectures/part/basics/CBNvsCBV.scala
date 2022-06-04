package lectures.part.basics

object CBNvsCBV extends App {

  def callByValue(x: Long) = {
    println("by value " + x)
    println("by value " + x)
  }

  def callByName(x: => Long) = {
    println("by name " + x)
    println("by name " + x)
  }

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
  printFirst(34, infinite())
//  printFirst(infinite(), 34)

}
