
class ToCamelCase {

    fun toCamelCase(str: String): String {
        val strList = str.split("_", "-").toMutableList()
        for (i in strList.indices) {
            strList[i] = if (i == 0) {
                strList[i]
            } else {
                strList[i].replaceFirstChar { it.uppercase() }
            }
        }
        return strList.joinToString("")
    }

    fun toCamelCaseKotlinWay(str: String): String {
        return str.split("_", "-")
            .map { it -> it.replaceFirstChar { it.uppercase() } }
            .joinToString ("")
    }

    fun toCamelCaseKotlinWaySecondTry(str: String): String {
        return str.split("_", "-")
            .upperCaseStartingFromSecond()
            .joinToString ("")
    }

}

private fun List<String>.upperCaseStartingFromSecond() = mapIndexed { index, string ->
    if (index == 0) { string}
    else { string.replaceFirstChar { it.uppercase() }}
}

fun main() {
    val camel = ToCamelCase()
    println(camel.toCamelCaseKotlinWaySecondTry("hallo-welt_hier"))
}
