package chessChecker

abstract class Figure(
    var name: String,
    var x: Int,
    var y: Int,
    val type: FigureType
) {
//    abstract fun inRange(field: Array<Array<Char>>): Boolean
}