class MorseCodeDecoder {
    fun decode(morseCode: String): String {
        return wordsFrom(morseCode)
                .map(this::decodeWord)
                .reduce { sentence, word -> "$sentence $word" }
    }

    private fun decodeWord(morseCode: String): String {
        return symbolsFrom(morseCode)
                .map(this::toAscii)
                .reduce { word, char -> word + char }
    }

    private fun wordsFrom(morseCode: String) = morseCode.trim().split("   ")

    private fun symbolsFrom(morseCode: String) = morseCode.split(" ")

    private fun toAscii(morseSymbol: String) = MORSE_CODE[morseSymbol] ?: ""
}