import org.junit.Assert.*
import org.junit.Test

class BitDecoderTest {

    @Test
    fun canDecodeSingleDot() {
        assertEquals(".", BitDecoder().decode("1"))
    }
}