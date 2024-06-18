import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

/**
 * Testing works verification after the initial project scaffold
 */
class AdditionTest {

    @Test
    fun `should execute addition correctly`() {
        expectThat(5 + 6).isEqualTo(11)
        expectThat(7 + 42).isEqualTo(49)
        expectThat(9999 + 1).isEqualTo(10000)
    }
}