class OldestAges {

    fun oldestAges(ages: List<Int>): List<Int> {
        var oldestAges: MutableList<Int> = mutableListOf()
        val agesSorted = ages.sorted()
        oldestAges.add(agesSorted[ages.size - 2])
        oldestAges.add(agesSorted[ages.size - 1])
        return oldestAges
    }

    fun oldestAgesWithoutMutable(ages: List<Int>): List<Int> {
        return ages.sorted().drop(ages.size - 2)
    }

}

fun main() {

}