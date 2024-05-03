fun testIt(a : Int,b : Int) : Int {
    var suma =0
    var sumb = 0
    a.toString().chars().map { it - '0'.code }.forEach { suma+=it }
    b.toString().chars().map {  it - '0'.code }.forEach { sumb+=it }
    return suma * sumb
}
