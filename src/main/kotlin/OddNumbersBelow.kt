fun oddCount(n: Int): Int {
    val oddList = mutableListOf<Int>()
    for (i in 0 .. n) {
        if (i % 2 != 0) {
            oddList.add(i)
        }
    }
    return oddList.size - 1
}

fun oddCountRefactored(n: Int): Int {
    return n / 2
}