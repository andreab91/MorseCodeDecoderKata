class BitDecoder {
    private val binaryDash = "111"
    private val binaryDot = "1"
    private val binarySpaceInsideChar = "0"

    fun decode(bits: String): String {
        return bits
                .replace(binaryDash, morseFromBinary(binaryDash))
                .replace(binaryDot, morseFromBinary(binaryDot))
                .replace(binarySpaceInsideChar, morseFromBinary(binarySpaceInsideChar))
    }

    private fun morseFromBinary(value: String) = BINARY_CODE[value] ?: ""
}