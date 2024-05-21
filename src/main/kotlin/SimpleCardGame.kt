class SimpleCardGame {

    private val cardValues = arrayOf('2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A')
    private var countJosh = 0
    private var countSteve = 0

    fun winner(deckJosh: Array<Char>, deckSteve: Array<Char>): String {
        countWinnersNewer(deckJosh, deckSteve)
        return when {
            countJosh == countSteve -> "Tie"
            countJosh > countSteve -> "Josh wins $countJosh to $countSteve"
            else -> "Steve wins $countSteve to $countJosh"
        }
    }

    

    private fun countWinnersNewer(deckJosh: Array<Char>, deckSteve: Array<Char>) {
        deckJosh.zip(deckSteve).forEach { (cardJosh, cardSteve) ->
            when {
                cardValues.indexOf(cardJosh) > cardValues.indexOf(cardSteve) -> countJosh += 1
                cardValues.indexOf(cardJosh) < cardValues.indexOf(cardSteve) -> countSteve += 1
            }
        }
    }
}