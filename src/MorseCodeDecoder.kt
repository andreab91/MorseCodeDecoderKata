class MorseCodeDecoder {
    fun decode(morse: String): String {
        return MORSE_CODE[morse].toString()
    }
}