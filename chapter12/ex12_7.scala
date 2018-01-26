def adjustToPair(f: (Int, Int) => Int) = {
  (pair: (Int, Int)) => f(pair._1, pair._2)
}

// Simplify
def adjustToPair(f: (Int, Int) => Int)(pair: (Int, Int)) =
  f(pair._1, pair._2) 

val pairs = (1 to 10) zip (11 to 20)

pairs.map(pair => adjustToPair1(_ * _)(pair)).foreach(println)
