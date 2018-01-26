def unless(condition: => Boolean)(blocks: => Unit): Unit = {
  if (!condition) {
    blocks
  }
}
