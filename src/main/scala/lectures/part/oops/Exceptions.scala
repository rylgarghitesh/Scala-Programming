package lectures.part.oops

object Exceptions extends App {

  def getInt(WithException: Boolean): Int = {
    if(WithException) throw new RuntimeException("Runtime")
    else throw new NullPointerException("Null pointer")
  }

  try {
    getInt(true)
  } catch {
    case e: RuntimeException => println("Runtime Exception")
    case f: NullPointerException => println("NullPointer Exception")
  } finally {
      println("finally")
  }

  try {
    getInt(false)
  } catch {
    case e: NullPointerException => println("NullPointer Exception")
    case f: RuntimeException => println("Runtime Exception")
  } finally {
    println("finally")
  }

}
