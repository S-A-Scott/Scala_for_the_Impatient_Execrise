import scala.collection.JavaConverters._

val wordCountMap: scala.collection.mutable.Map[String, Int] =
  new java.util.TreeMap[String, Int]().asScala
val in = new java.util.Scanner(new java.io.File("myfile.txt"))

while (in.hasNext()) {
  val word = in.next()
  wordCountMap(word) = wordCountMap.getOrElse(word, 0) + 1
}

for ((k, v) <- wordCountMap)
  println("Key: " + k + "\t" + "Value: " + v)
