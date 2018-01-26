def factorial(x: Int) = {
  (1 to x).foldLeft(1)(_ * _)
}

// (1 to -10).reduceLeft(_ * _) will cause 
// **UnsupportedOperationException**
