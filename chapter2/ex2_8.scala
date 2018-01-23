def product(s: String) = {
  var productOfStrUnicode = 1L
  s.foreach(productOfStrUnicode *= _.toLong)
  productOfStrUnicode
}
