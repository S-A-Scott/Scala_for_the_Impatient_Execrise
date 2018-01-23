def swapAdjacentElement(arr: Array[Int]) = {
  for (i <- 0 until arr.length ) yield
    if (i % 2 == 1) arr(i - 1)
    else if (i == arr.length - 1) arr(i)
    else arr(i + 1)
}
