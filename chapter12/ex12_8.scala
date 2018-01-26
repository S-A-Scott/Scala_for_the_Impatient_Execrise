val namesArray  = Array("spencer", "adam", "alice", "kimmy")
val lengthArray = Array(7, 4, 5, 5)

namesArray.corresponds(lengthArray)(_.length.equals(_))

