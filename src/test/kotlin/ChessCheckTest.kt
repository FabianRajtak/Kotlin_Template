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
    fun `is not check if pond is above`() {
        // Given
        val check = ChessCheck()
        // When
        val result = check.checkMate(arrayOf(
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', 'K', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')))
        // Then
        assertFalse(result)
    }

    @Test
    fun `is check when pond can beat king` () {
        // Given
        val check = ChessCheck()
        // When
        val result = check.checkMate(arrayOf(
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', 'P', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', 'K', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')))
        // Then
        assertTrue(result)
    }

    @Test
    fun `is only check if king is in strike range` () {
        // Given
        val check = ChessCheck()
        // When
        val result = check.checkMate(arrayOf(
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', 'P', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', 'K', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')))
        // Then
        assertFalse(result)
    }

    @Test
    fun `is check with more than two figures`() {
        // Given
        val check = ChessCheck()
        // When
        val result = check.checkMate(arrayOf(
            arrayOf(' ', 'N', ' ', ' ', ' ', 'P', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf('K', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')))
        // Then
        assertTrue(result)
    }

    @Test
    fun `is check when rook is in range`() {
        // Given
        val check = ChessCheck()
        // When
        val result = check.checkMate(arrayOf(
            arrayOf(' ', 'N', ' ', ' ', ' ', 'P', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
            arrayOf('K', ' ', ' ', ' ', ' ', ' ', 'R', ' ')))
        // Then
        assertTrue(result)
    }
}