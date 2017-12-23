class MorseCodeDecoder {
    fun decode(morseCode: String): String {
        return wordsFrom(morseCode).joinToString(" ", transform = this::decodeWord)
    }

    private fun decodeWord(morseCode: String): String {
        return symbolsFrom(morseCode).joinToString("", transform = this::decodeSymbol)
    }

    private fun wordsFrom(morseCode: String) = morseCode.trim().split("   ")

    private fun symbolsFrom(morseCode: String) = morseCode.split(" ")

    private fun decodeSymbol(morseSymbol: String) = MORSE_CODE[morseSymbol] ?: ""
}