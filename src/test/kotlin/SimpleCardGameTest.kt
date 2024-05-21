import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

class SimpleCardGameTest {

    @Test
    fun `does returns a tie`() {
        //Given
        val simpleCardGame = SimpleCardGame()

        //When
        val deckJosh = arrayOf('A')
        val deckSteve = arrayOf('A')
        val result = simpleCardGame.winner(deckJosh, deckSteve)

        //Then
        assertEquals(result, "Tie")
    }

    @Test
    fun `does returns a winner`() {
        //Given
        val simpleCardGame = SimpleCardGame()

        //When
        val deckJosh = arrayOf('A')
        val deckSteve = arrayOf('K')
        val result = simpleCardGame.winner(deckJosh, deckSteve)

        //Then
        assertEquals(result, "Josh wins 1 to 0")
    }

    @Test
    fun `counts the score for the players`() {
        //Given
        val simpleCardGame = SimpleCardGame()

        //When
        val deckJosh = arrayOf('A', '5', 'Q')
        val deckSteve = arrayOf('K', '9', '6')
        val result = simpleCardGame.winner(deckJosh, deckSteve)

        //Then
        assertEquals(result, "Josh wins 2 to 1")
    }

    @Test
    fun `returns tie with bigger decks`() {
        //Given
        val simpleCardGame = SimpleCardGame()

        //When
        val deckJosh = arrayOf('A', '5', 'Q', '2', '9', 'T')
        val deckSteve = arrayOf('K', '9', '6', '2', 'J', 'T')
        val result = simpleCardGame.winner(deckJosh, deckSteve)

        //Then
        assertEquals(result, "Tie")
    }

    @Test
    fun `returns steven as winner with bigger decks`() {
        //Given
        val simpleCardGame = SimpleCardGame()

        //When
        val deckJosh = arrayOf('A', '5', 'Q', '3', '4', 'J', 'J')
        val deckSteve = arrayOf('K', '9', '6', 'T', '8', 'Q', 'K')
        val result = simpleCardGame.winner(deckJosh, deckSteve)

        assertEquals(result, "Steve wins 5 to 2")
    }

}