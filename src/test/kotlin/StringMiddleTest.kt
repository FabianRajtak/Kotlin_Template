import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class StringMiddleTest {

    @Test
    fun `returns the two middle letters`() {
        //Given
        val stringMiddle = StringMiddle()
        //When
        val result = stringMiddle.getMiddle("word")
        //Then
        assertEquals("or", result)
    }

    @Test
    fun `returns the middle letter`() {
        //Given
        val stringMiddle = StringMiddle()
        //When
        val result = stringMiddle.getMiddle("testing")
        //Then
        assertEquals("t", result)
    }

}