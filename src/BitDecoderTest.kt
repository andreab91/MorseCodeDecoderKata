import org.junit.Assert.assertEquals
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

    @Test
    fun testCanFindTheBitRate() {
        assertEquals(1, decoder.bitRateOf("10111"))
        assertEquals(2, decoder.bitRateOf("110111111"))
        assertEquals(2, decoder.bitRateOf("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"))
    }

    @Test
    fun testCanDecodeAnEntireSentence() {
        assertEquals(".... . -.--   .--- ..- -.. .", decoder.decode("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"))
    }
}