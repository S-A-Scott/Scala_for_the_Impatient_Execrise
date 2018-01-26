class Time(val hours: Int, val minutes: Int) {
  def before(that: Time): Boolean = {
    if (this.hours > that.hours) true
    else if (this.hours == that.hours) this.minutes > that.minutes
    else false
  }
}

// Better Solution
def before(that: Time) = {
  this.hours > that.hours ||
    (this.hours == that.hours && this.minutes > that.minutes)
}
