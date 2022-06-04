package exercises.oops.helper

class Counter(val count: Int = 0) {
  def inc() = {
    println("Incrementing: " + count + " by 1")
    new Counter(count + 1)
  }
  def dec() = {
    println("Decrementing: " + count + " by 1")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter =
    if (n <= 0 ) this
    else inc.inc(n - 1)

  def dec(n: Int): Counter =
    if (n <= 0 ) this
    else dec.dec(n - 1)

  def printCount = println(count)
}
