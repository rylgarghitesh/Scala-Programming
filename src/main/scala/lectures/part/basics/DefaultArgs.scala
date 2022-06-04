package lectures.part.basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080) =
    println("Saving Picture in format: " + format + " height: " + height + " width: " + width)


  println(trFact(10,2))
  savePicture(height = 400, width = 600)
  savePicture(height = 600, width = 800, format = "map")
}
