class BitDecoder {
    private val binaryDash = "111"
    private val binaryDot = "1"
    private val binarySpaceInChar = "0"
    private val binarySpaceInWord = "000"
    private val binarySpaceInSentence = "00000"

    fun decode(bits: String): String {
        return bits
                .replace(binaryDash, morseFromBinary(binaryDash))
                .replace(binaryDot, morseFromBinary(binaryDot))
                .replace(binarySpaceInSentence, morseFromBinary(binarySpaceInSentence))
                .replace(binarySpaceInWord, morseFromBinary(binarySpaceInWord))
                .replace(binarySpaceInChar, morseFromBinary(binarySpaceInChar))
    }

    fun bitRateOf(bits: String): Int {
        val pattern = Regex("$binaryDash+")
        return pattern.findAll(bits)
                .map { it.value.countSubstring(binaryDash) }
                .min() ?: 0
    }

    private fun morseFromBinary(value: String) = BINARY_CODE[value] ?: ""

    private fun String.countSubstring(sub: String): Int = this.split(sub).size - 1
}