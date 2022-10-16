import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class RansomNoteTest {

    @Test
    fun testSolution1() {
        val expected: Boolean = false
        val solution = RansomNote.Solution()
        val actual = solution.run("a", "b")
        assertEquals(expected, actual)
    }

    @Test
    fun testSolution2() {
        val expected: Boolean = false
        val solution = RansomNote.Solution()
        val actual = solution.run("aa", "ab")
        assertEquals(expected, actual)
    }

    @Test
    fun testSolution3() {
        val expected: Boolean = true
        val solution = RansomNote.Solution()
        val actual = solution.run("aa", "aab")
        assertEquals(expected, actual)
    }

    @Test
    fun testSolution4() {
        val expected: Boolean = true
        val solution = RansomNote.Solution()
        val actual = solution.run("", "")
        assertEquals(expected, actual)
    }
}
