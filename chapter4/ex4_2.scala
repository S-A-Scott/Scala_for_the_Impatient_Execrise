val in = new java.util.Scanner(new java.io.File("myfile.txt"))
val wordCountMap = new mutable.HashMap[String, Int]

while (in.hasNext()) {
  val word = in.next()
  if (wordCountMap.contains(word)) {
    val count = wordCountMap(word) + 1
    wordCountMap += word -> count
  } else {
    wordCountMap += word -> 1
  }
}

// Better Solution
while (in.hasNext()) {
  val word = in.next()
  wordCountMap(word) = wordCountMap.getOrElse(word, 0) + 1
}

for ((k, v) <- wordCountMap)
  println("Key: " + k + "\t" + "Value: " + v)
