import kotlin.test.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class ControlFlowTest {

    @Test
    fun `Given a listed animal return its animal sound`() {
        val actual = getAnimalSounds("dog")
        assertEquals(actual, "bark")
    }
}