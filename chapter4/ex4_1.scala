val productionMap = Map("A" -> 100, "B" -> 200, "C" -> 300)
val discountMap = for ((k, v) <- productionMap) yield
  (k, 0.9 * v)
