import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class CamelCaseTest {

    private val camel = ToCamelCase()
    @Test
    fun testFixed() {
        assertEquals("", camel.toCamelCase(""))
        assertEquals("theStealthWarrior", camel.toCamelCaseKotlinWaySecondTry("the_stealth_warrior"))
        assertEquals("TheStealthWarrior", camel.toCamelCaseKotlinWaySecondTry("The-Stealth-Warrior"))
        assertEquals("ABC", camel.toCamelCaseKotlinWaySecondTry("A-B-C"))
    }
}