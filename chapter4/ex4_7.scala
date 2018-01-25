import scala.collection.JavaConverters._

val props: scala.collection.Map[String, String] = System.getProperties.asScala
var len = 0  // find longest key length
for ((i, _) <- props)
  if (i.length > len) len = i.length

for ((k, v) <- props) {
  val keyLength = k.length
  print(k + " " * (len - keyLength + 1) + "|")
  println(v)
}
