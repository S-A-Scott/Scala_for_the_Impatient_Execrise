val in = new java.util.Scanner(new java.io.File("myfile.txt"))
val wordCountMap = new scala.collection.mutable.TreeMap[String, Int]

while (in.hasNext()) {
  val word = in.next()
  wordCountMap(word) = wordCountMap.getOrElse(word, 0) + 1
}

for ((k, v) <- wordCountMap)
  println("Key: " + k + "\t" + "Value: " + v)
