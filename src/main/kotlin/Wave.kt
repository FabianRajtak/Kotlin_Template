fun wave(str: String): List<String> {
    val waveList = mutableListOf<String>()
    for (i in str.indices) {
        val charArray = str.toCharArray()
        if (charArray[i].isLetter()) {
            charArray[i] = charArray[i].uppercaseChar()
            waveList.add(String(charArray))
        }
    }
    return waveList
}

fun waveRefactored(str: String): List<String> {
    val waveList = mutableListOf<String>()
    str.mapIndexed { index, char ->
        val newString = str.substring(0, index) + char.uppercaseChar() + str.substring(index + 1)
        if (char.isLetter()) {
            waveList.add(newString)
        }
    }
    return waveList
}

fun waveReRefactored(str: String): List<String> {
    return str.mapIndexed { index, char ->
            str.substring(0, index) + char.uppercaseChar() + str.substring(index + 1)
    }
}