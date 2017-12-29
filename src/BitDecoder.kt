class BitDecoder {
    private val binaryDash = "111"
    private val binaryDot = "1"
    private val binarySpaceInChar = "0"
    private val binarySpaceInWord = "000"
    private val binarySpaceInSentence = "00000"

    fun decode(bits: String): String {
        val bitRate = bitRateOf(bits)
        return bits
                .replace(binaryDash.repeat(bitRate), morseFromBinary(binaryDash))
                .replace(binaryDot.repeat(bitRate), morseFromBinary(binaryDot))
                .replace(binarySpaceInSentence.repeat(bitRate), morseFromBinary(binarySpaceInSentence))
                .replace(binarySpaceInWord.repeat(bitRate), morseFromBinary(binarySpaceInWord))
                .replace(binarySpaceInChar.repeat(bitRate), morseFromBinary(binarySpaceInChar))
    }

    fun bitRateOf(bits: String): Int {
        val pattern = Regex("$binaryDash+")
        return pattern.findAll(bits)
                .map { it.value.countSubstring(binaryDash) }
                .min() ?: 1
    }

    private fun morseFromBinary(value: String) = BINARY_CODE[value] ?: ""
}

private fun String.countSubstring(sub: String): Int = this.split(sub).size - 1
