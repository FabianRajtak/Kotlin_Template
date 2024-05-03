fun high(str: String): String {
    val words = str.split(" ")
    var highestScoringWord = ""
    var maxScore = 0

    for (word in words) {
        var score = 0
        for (char in word) {
            score += char.code - 'a'.code + 1
        }
        if (score > maxScore) {
            maxScore = score
            highestScoringWord = word
        }
    }
    return highestScoringWord
}

fun highRefactored(str: String): String = str
    .split(" ")
    .maxBy { charScore(it) }

fun charScore(word: String): Int {
    return word.sumOf { it - 'a' + 1 }
}