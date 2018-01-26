def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
  inputs.map(fun(_)).reduceLeft(_ max _)
}

// Better Solution
def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
  inputs.map(fun(_)).max
}
