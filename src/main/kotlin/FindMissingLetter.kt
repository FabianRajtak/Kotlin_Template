fun findMissingLetter(array: CharArray): Char {
    val missingLetter: Char = if (array[0] == array[0].lowercaseChar()) {
        missingLetterLowercase(array)
    } else {
        missingLetterUppercase(array)
    }
    return missingLetter
}

fun missingLetterLowercase(array: CharArray): Char {
    var i = 0
    var missingLetter = ' '
    for (char in array[0]..'z') {
        if (array[i] == char) {
            i++
        } else {
            missingLetter = char
            break
        }
    }
    return missingLetter
}

fun missingLetterUppercase(array: CharArray): Char {
    for (char in array[0]..'Z') {
        if (!array.contains(char)) {
            return char
        }
    }
    return '0'
}

fun missingLetterWithoutCase(array: CharArray): Char {
    for (char in array[0] .. array[array.size - 1]) {
        if (!array.contains(char)) {
            return char
        }
    }
    return '0'
}

fun main() {
    val char1 = charArrayOf('C','D','F','G','H','I','J')
    val char2 = charArrayOf('i','j','k','l','n','o','p')
    println(missingLetterWithoutCase(char2))
}