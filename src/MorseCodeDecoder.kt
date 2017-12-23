class MorseCodeDecoder {
    fun decode(morseCode: String): String {
        return symbolsFrom(morseCode)
                .map(this::toAscii)
                .reduce { word, char -> word + char }
    }

    private fun symbolsFrom(morseCode: String) = morseCode.split(" ")

    private fun toAscii(morseSymbol: String) = MORSE_CODE[morseSymbol].toString()
}