fun chooseBestSum(t: Int, k: Int, ls: List<Int>): Int {
    val sumList = combinations(k, ls).filter { it <= t }
    return sumList.maxOrNull() ?: -1
}

fun combinations(k: Int, ls: List<Int>): List<Int> {
    val sumList = mutableListOf<Int>()

    for (i in 0..<ls.size - (k - 1)) {
        generateCombinations(k - 1, ls.drop(i + 1), listOf(ls[i]), sumList)
    }
    return sumList.toList()
}

private fun generateCombinations(k: Int, ls: List<Int>, currentCombination: List<Int>, sumList: MutableList<Int>) {
    if (k == 0) {
        sumList.add(currentCombination.sum())
        return
    }
    for (i in 0..<ls.size - (k - 1)) {
        generateCombinations(k - 1, ls.drop(i + 1), currentCombination + ls[i], sumList)
    }
}