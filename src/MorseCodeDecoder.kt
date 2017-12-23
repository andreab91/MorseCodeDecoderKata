class MorseCodeDecoder {
    fun decode(morseCode: String): String {
        return wordsFrom(morseCode).joinToString(asciiWordsSeparator, transform = this::decodeWord)
    }

    private fun decodeWord(morseCode: String): String {
        return symbolsFrom(morseCode).joinToString(asciiSymbolsSeparator, transform = this::decodeSymbol)
    }

    private fun wordsFrom(morseCode: String) = morseCode.trim().split(morseWordsSeparator)

    private fun symbolsFrom(morseCode: String) = morseCode.split(morseSymbolsSeparator)

    private fun decodeSymbol(morseSymbol: String) = MORSE_CODE[morseSymbol] ?: asciiSymbolsSeparator
}