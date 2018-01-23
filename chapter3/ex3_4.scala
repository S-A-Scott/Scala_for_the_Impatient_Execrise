def process(arr: Array[Int]) = {
  val positiveIndexes = for (i <- 0 until arr.length if arr(i) > 0) yield  i
  val othersIndexes = for (i <- 0 until arr.length if arr(i) <= 0) yield i

  val result = new Array[Int](arr.length)

  for (i <- 0 until positiveIndexes.length)
    result(i) = arr(positiveIndexes(i))
  for (i <- 0 until othersIndexes.length)
    result(i + positiveIndexes.length) = arr(othersIndexes(i))

  result
}
