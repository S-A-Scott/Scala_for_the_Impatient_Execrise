class Person(val name: String) {
  val firstName = name.split(" ")(0)
  val lastName  = name.split(" ")(1)
}

