object App {
  def makeArray(n: Int) = {
    val a = new Array[Int](n)
    for (i <- a) yield  util.Random.nextInt(n)
  }

  def main(args: Array[String]): Unit = {
    makeArray(10).foreach(println)
  }
}
