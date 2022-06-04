package exercises.oops

import exercises.oops.helper.{Counter, Novel, Person, Writer}

object OOBasics extends App {

  val person = new Person("John", 20)
  println(person.age)
  person.greet("Daniel")

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  var counter = new Counter
  counter.inc.printCount
  counter.dec.printCount
  counter.inc(5).printCount
  counter.dec(3).printCount
  counter.inc.inc.inc.printCount
  counter.dec.dec.dec.printCount
}
