def values(fun: (Int) => Int, low: Int, high: Int) = {
  for (i <- low to high)
    yield (i, fun(i))
}

// Better Solution

def values(fun: (Int) => Int, low: Int, high: Int) =
  (low to high).map(x => (x, fun(x)))
