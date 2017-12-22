import org.junit.Assert.*
import org.junit.Test

class MorseCodeDecoderTest {

    @Test
    fun testCanConvertSingleCharacter() {
        assertEquals("A", MorseCodeDecoder().decode(".-"))
    }
}