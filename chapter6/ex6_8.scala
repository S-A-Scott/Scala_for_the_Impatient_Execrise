object RGBCube extends Enumeration {
  val R     = Value(0xff0000)
  val G     = Value(0x00ff00)
  val B     = Value(0x0000ff)
  val RG    = Value(0xffff00)
  val RB    = Value(0xff00ff)
  val GB    = Value(0x00ffff)
  val RGB   = Value(0xffffff)
  val BLACK = Value(0x000000)
}

for (c <- RGBCube.values)
  printf("#%06x=%s\n", c.id, c)
