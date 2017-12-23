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
    }
}