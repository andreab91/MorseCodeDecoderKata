class BitDecoder {
    fun decode(bits: String): String {
        return bits.replace("1", morseFromBinary("1"))
    }

    private fun morseFromBinary(value: String) = BINARY_CODE[value] ?: ""
}