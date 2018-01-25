def lteqgt(values: Array[Int], v: Int) = {
  var lt, eq, gt = 0
  for (i <- values)
    if (i > v) lt += 1
    else if (i < v) gt += 1
    else eq += 1

  (lt, eq, gt)
}

lteqgt(Array(1, 2, 3, 4, 5), 3)
