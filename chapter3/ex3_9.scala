val timeZoneArray = java.util.TimeZone.getAvailableIDs
val AmericaTimeZoneArray = for (i <- timeZoneArray if i.startsWith("America")) yield i.drop("America/".length)


scala.util.Sorting.quickSort(AmericaTimeZoneArray)
