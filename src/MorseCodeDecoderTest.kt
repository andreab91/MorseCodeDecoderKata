import org.junit.Assert.*
import org.junit.Test

class MorseCodeDecoderTest {

    private val decoder = MorseCodeDecoder()

    @Test
    fun testCanConvertSingleCharacter() {
        assertEquals("A", decoder.decode(".-"))
    }

    @Test
    fun testCanConvertSingleWord() {
        assertEquals("CIAO", decoder.decode("-.-. .. .- ---"))
    }
}