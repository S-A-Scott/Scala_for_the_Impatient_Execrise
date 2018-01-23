def product(s: String): Long = {
  def loop(n: Int, result: Long):Long = {
    if (n < 0) result
    else loop(n - 1, result * s(n).toLong)
  }
  loop(s.length - 1, 1L)
}
