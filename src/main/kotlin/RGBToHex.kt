@OptIn(ExperimentalStdlibApi::class)
fun rgb(r: Int, g: Int, b: Int): String {
    return (checkRange(r).toHexString().substring(6)
            + checkRange(g).toHexString().substring(6)
            + checkRange(b).toHexString().substring(6)).uppercase()
}

fun checkRange(int: Int): Int {
    return when {
        int < 0 -> 0
        int > 255 -> 255
        else -> int
    }
}

fun rgbWithoutOptIn(r: Int, g: Int, b: Int): String {
    return (Integer.toHexString(checkRange(r)).padStart(2,'0')
            + Integer.toHexString(checkRange(g)).padStart(2,'0')
            + Integer.toHexString(checkRange(b)).padStart(2,'0')).uppercase()
}

fun main() {
    println(rgb(255, 0, 255))
    println(rgbWithoutOptIn(255, 0, 255))
}