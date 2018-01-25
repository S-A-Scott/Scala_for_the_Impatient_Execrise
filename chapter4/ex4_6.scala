import scala.collection.mutable

val map = new mutable.LinkedHashMap[String, Int]
map("Monday")    = java.util.Calendar.MONDAY
map("Tuesday")   = java.util.Calendar.TUESDAY
map("Wednesday") = java.util.Calendar.WEDNESDAY
map("Thursday")  = java.util.Calendar.THURSDAY
map("Friday")    = java.util.Calendar.FRIDAY
map("Saturday")  = java.util.Calendar.SATURDAY
map("Sunday")    = java.util.Calendar.SUNDAY
