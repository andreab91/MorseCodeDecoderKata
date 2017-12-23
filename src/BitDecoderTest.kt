import org.junit.Assert.*
import org.junit.Test

class BitDecoderTest {

    private val decoder = BitDecoder()

    @Test
    fun testCanDecodeSingleDot() {
        assertEquals(".", decoder.decode("1"))
    }

    @Test
    fun testCanDecodeSingleDash() {
        assertEquals("-", decoder.decode("111"))
    }

    @Test
    fun testCanDecodeSpaceBetweenDotsAndDashesInCharacter() {
        assertEquals("", decoder.decode("0"))
        assertEquals("-.", decoder.decode("11101"))
    }

    @Test
    fun testCanDecodeSpaceBetweenCharactersInWord() {
        assertEquals(" ", decoder.decode("000"))
        assertEquals(". -", decoder.decode("1000111"))
    }

    @Test
    fun testCanDecodeSpaceBetweenWords() {
        assertEquals("   ", decoder.decode("00000"))
        assertEquals(".   .-", decoder.decode("10000010111"))
    }
}