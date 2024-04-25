class CountDuplicates {

    fun countDuplicates(str: String): Number {
        var duplicateCount = 0
        val strList = str.lowercase().toCharArray().toList()
        val distinctChars = strList.distinct()

        for (char in distinctChars) {
            val count = strList.count { it == char }

            if (count > 1) {
                duplicateCount++
            }
        }

        return duplicateCount
    }

    fun countDuplicatesBetter(str: String): Number {
        val inputStringLower = str.lowercase()
        val charCount = inputStringLower.groupingBy { it }.eachCount()
        val duplicateCount = charCount.count { it.value > 1 }
        return duplicateCount
    }

}

fun main() {

}