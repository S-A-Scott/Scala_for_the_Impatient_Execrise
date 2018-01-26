class Time(val hours: Int, val minutes: Int) {
  private val minutesFromADay= hours * 60 + minutes
  def before(that: Time): Boolean =
    this.minutes > that.minutes
}
