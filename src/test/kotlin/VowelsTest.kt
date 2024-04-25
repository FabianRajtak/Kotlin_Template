import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class VowelsTest {
    val vowels = Vowels()
    @Test
    fun testFixed() {
        assertEquals(5, vowels.countVowels("abracadabra"))
        assertEquals(1, vowels.countVowels("test"))
        assertEquals(3, vowels.countVowels("example"))
    }

}