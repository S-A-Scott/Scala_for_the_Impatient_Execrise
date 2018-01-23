// Invert function for Array
def revertArray(arr: Array[Int]): Unit = {
  for (i <- 0 until arr.length/2) {
    val temp = arr(i)
    arr(i) = arr(arr.length - i - 1)
    arr(arr.length - i - 1) = temp
  }
}

// for ArrayBuffer
val arr1 = ArrayBuffer(1, 2, 3, 4, 5, 6)
val arr2 = new ArrayBuffer[Int](arr1.length)

arr2 ++= arr1.reverse
