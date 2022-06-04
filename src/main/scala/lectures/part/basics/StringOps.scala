package lectures.part.basics

object StringOps extends App {

  val str = "Hello I am learning scala"

  println("String chars at 2 is: " + str.charAt(2))
  println("String substring: " + str.substring(7, 11))
  println("String split: " + str.split(" ").toList)
  println("String startsWith Hell (T/F): " + str.startsWith("Hell"))
  println("String replacement: " + str.replace(" " , "-"))
  println("String UpperCase: " + str.toUpperCase())
  println("String LowerCase: " + str.toLowerCase())
  println("String length: " + str.length)

  val aNumberString = "12"
  val aNumber = aNumberString.toInt
  println('a' + aNumber + 'z')
  println(str.reverse)
  println(str.take(2))

  val name = "David"
  val age = 12
  val greetings = s"Hello my name is $name and my age is $age years old."
  println(greetings)

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.3f burgers per minute."
  println(myth)

}
