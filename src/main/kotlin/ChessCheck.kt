class ChessCheck {
    fun checkMate(field: Array<Array<Char>>): Boolean {
        var pond = Figure(ChessFigureType.DEFAULT, 0, 0)
        var knight = Figure(ChessFigureType.DEFAULT, 0, 0)
        var rook = Figure(ChessFigureType.ROOK, 0 ,0)
        var king = Figure(ChessFigureType.DEFAULT, 0, 0)

        var amountOfFigures = 0

        for (array in field) {
            if (array.contains('P')) {
                pond = Figure(ChessFigureType.POND, array.indexOf('P'), field.indexOf(array))
                amountOfFigures += 1
            }

            if (array.contains('N')) {
                knight = Figure(ChessFigureType.KNIGHT, array.indexOf('N'), field.indexOf(array))
                amountOfFigures += 1
            }

            if (array.contains('R')) {
                rook = Figure(ChessFigureType.ROOK, array.indexOf('R'), field.indexOf(array))
                amountOfFigures += 1
            }

            if (array.contains('K')) {
                king = Figure(ChessFigureType.KING, array.indexOf('K'), field.indexOf(array))
                amountOfFigures += 1
            }
        }
        return amountOfFigures > 1
                && figureInRange(pond, field)
                || figureInRange(knight, field)
                || figureInRange(rook, field)
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
    ROOK,
    DEFAULT;
}

fun figureInRange(figure: Figure, field: Array<Array<Char>>): Boolean {
    when (figure.type) {
        ChessFigureType.POND -> {
            return when (figure.x) {
                in 1..6 -> field[figure.y + 1][figure.x + 1].isLetter() || field[figure.y + 1][figure.x - 1].isLetter()
                0 -> field[figure.y + 1][1].isLetter()
                else -> field[figure.y + 1][7].isLetter()
            }
        }
        ChessFigureType.KNIGHT -> {
            return field[figure.y+2][figure.x-1] == 'K'
        }
        ChessFigureType.ROOK -> {

        }

        else -> { false }
    }
    return false
}