def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
  inputs.map(n => (n, fun(n))).reduceLeft((x, y) => {
    if (x._2 > y._2) x
    else y
  })._1
}
