package lectures.part.basics

object Expressions extends App {

  val x = 1+2
  println("value: " + x)
  println(2 + 3*4)
  println(4 == x+1)
  println(x=x+1)
  println(!(4 == x))

  var aVariable = 2
  aVariable += 1
  println("value: " + aVariable)

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println("value: " + aConditionValue)

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z>2) "Hello" else "bye"
  }

  println(aCodeBlock)
}
