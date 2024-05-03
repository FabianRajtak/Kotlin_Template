object EnoughIsEnough {

    fun deleteNth(elements: IntArray, maxOccurrences: Int): IntArray {
        val list = elements.toList()

        val result = list.fold(mutableListOf<Int>()) { accumulator, element ->
            val count = accumulator.count { it == element }
            if (count < maxOccurrences) {
                accumulator.add(element)
            }
            accumulator
        }
        return result.toIntArray()
    }

    fun deleteNth1(elements: IntArray, maxOcurrences: Int): IntArray {
        val result = mutableListOf<Int>()
        elements.groupBy { it }.forEach { group -> result.addAll(group.value.take(maxOcurrences)) }
        return result.toIntArray()
    }


    fun main() {

    }
}
