def swapAdjacentElement(arr: Array[Int]): Unit = {
  for (i <- 0 until (arr.length - 1, 2)) {
    val temp = arr(i)
    arr(i) = arr(i+1)
    arr(i+1) = temp
  }
}
