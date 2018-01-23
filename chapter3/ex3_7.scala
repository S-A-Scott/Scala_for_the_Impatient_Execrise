import scala.collection.mutable.ArrayBuffer

val arr = Array(1, 3, 3, 0, 1, 9, 8, 7, 7)
val arrBuf = new ArrayBuffer[Int]()
arrBuf ++= arr.distinct
