import org.testng.AssertJUnit.*
import org.testng.annotations.Test

class ChessCheckTest {
    @Test
    fun `is not check when no other figure given` () {
        // Given
        val check = ChessCheck()
        // When
        val result = check.checkMate(arrayOf(
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', 'K', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')))
        // Then
        assertFalse(result)

    }

    @Test
    fun `is check when two figures given` () {
        // Given
        val check = ChessCheck()
        // When
        val result = check.checkMate(arrayOf(
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', 'K', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')))
        // Then
        assertTrue(result)

    }


}