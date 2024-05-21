class ChessCheck {
    fun checkMate(field: Array<Array<Char>>): Boolean {
        var pond = Figure(ChessFigureType.DEFAULT, 0, 0)
        var knight: Figure
        var king: Figure

        var counter = 0

        for (array in field) {
            if (array.contains('P')) {
                pond = Figure(ChessFigureType.POND, array.indexOf('P'), field.indexOf(array))
                counter += 1
            } else if (array.contains('N')) {
                var knight = Figure(ChessFigureType.KNIGHT, array.indexOf('N'), field.indexOf(array))
                counter += 1
            } else if (array.contains('K')) {
                var king = Figure(ChessFigureType.KING, array.indexOf('K'), field.indexOf(array))
                counter += 1
            }
        }
        return counter > 1 && isInRange(pond, field)
    }
}

class Figure (
    var type: ChessFigureType,
    var x: Int,
    var y: Int
)

enum class ChessFigureType {
    KING,
    POND,
    KNIGHT,
    DEFAULT;
}

fun isInRange(figure: Figure, field: Array<Array<Char>>): Boolean {

    when (figure.type) {
        ChessFigureType.POND -> {
            return when (figure.x) {
                in 1..6 -> field[figure.y + 1][figure.x + 1].isLetter() || field[figure.y + 1][figure.x - 1].isLetter()
                0 -> field[figure.y + 1][1].isLetter()
                else -> field[figure.y + 1][7].isLetter()
            }
        }
        ChessFigureType.KING -> TODO()
        ChessFigureType.KNIGHT -> TODO()
        ChessFigureType.DEFAULT -> TODO()
    }
    return false
}