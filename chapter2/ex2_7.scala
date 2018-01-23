//def foreach(f: (A) ⇒ Unit): Unit
//
var productOfStrUnicode: Long = 1
"Hello".foreach(ch => productOfStrUnicode *= ch.toLong)
// Better Solution 
// "Hello".foreach(productOfStrUnicode *= _.toLong)
