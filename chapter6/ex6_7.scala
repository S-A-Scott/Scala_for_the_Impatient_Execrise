object CardSuit extends Enumeration {
  val Clubs    = Value("♣")
  val Diamonds = Value("♦")
  val Hearts   = Value("♥")
  val Spades   = Value("♠")
}

def whetherHeartsCard(card: CardSuit.Value) =
  if (card == CardSuit.Hearts) true else false
