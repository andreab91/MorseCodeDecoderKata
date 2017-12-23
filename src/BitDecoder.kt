class BitDecoder {
    private val binaryDash = "111"
    private val binaryDot = "1"
    private val binarySpaceInChar = "0"
    private val binarySpaceInWord = "000"

    fun decode(bits: String): String {
        return bits
                .replace(binaryDash, morseFromBinary(binaryDash))
                .replace(binaryDot, morseFromBinary(binaryDot))
                .replace(binarySpaceInWord, morseFromBinary(binarySpaceInWord))
                .replace(binarySpaceInChar, morseFromBinary(binarySpaceInChar))
    }

    private fun morseFromBinary(value: String) = BINARY_CODE[value] ?: ""
}