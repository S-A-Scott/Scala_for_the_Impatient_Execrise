def pow(x: Int, n: Int):Double = {
  def positivePow(a: Int, b: Int):Int = {
    if (b == 0) 1
    else if (b % 2 == 0) positivePow(a, b/2) * positivePow(a, b/2)
    else a * positivePow(a, b - 1)
  }
  if (n >= 0)
    positivePow(x, n)
  else
    1.0 / positivePow(x, math.abs(n))
}
