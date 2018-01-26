def factorial(n: Int) = {
  (1 to n).reduceLeft(_ * _)
}
