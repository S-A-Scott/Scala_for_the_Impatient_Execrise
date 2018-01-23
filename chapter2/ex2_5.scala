def countdown(n: Int): Unit = {
  for (i <- n.to(0, -1))
    print(i + " ")
  println()
}
