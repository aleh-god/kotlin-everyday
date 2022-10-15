import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class NumbersTest {

    @Test
    fun test() {
        val actual = 12 + 4
        val numbers: Numbers = Numbers.Base(12, 4)
        val expected = numbers.sum()
        assertEquals(expected, actual)
    }
}