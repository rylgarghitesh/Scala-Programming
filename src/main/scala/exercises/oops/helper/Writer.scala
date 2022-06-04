package exercises.oops.helper

class Writer(firstName: String, surName: String, val year: Int) {
  def fullName: String = firstName + " " + surName
}