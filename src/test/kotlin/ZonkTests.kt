import org.testng.Assert.assertEquals
import org.testng.annotations.Test


class ZonkTests {
    @Test
    fun test1() {
        doTest(intArrayOf(1), 100)
        doTest(intArrayOf(2), 0)
        doTest(intArrayOf(3), 0)
        doTest(intArrayOf(4), 0)
        doTest(intArrayOf(5), 50)
        doTest(intArrayOf(6), 0)
    }

    @Test
    fun test2() {
        doTest(intArrayOf(1, 1), 200)
        doTest(intArrayOf(1, 1, 1), 1000)
        doTest(intArrayOf(1, 2, 3, 4, 5, 6), 1000)
        doTest(intArrayOf(2, 2, 3, 3, 6, 6), 750)
        doTest(intArrayOf(3, 2, 6, 4, 4, 6), 0)
    }

    private fun doTest(dice: IntArray, expected: Int) {
        assertEquals(getScore(dice), expected, "(" + dice.joinToString() + ")")
    }
}