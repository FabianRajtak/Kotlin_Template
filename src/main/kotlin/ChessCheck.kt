class ChessCheck {
    fun checkMate(field: Array<Array<Char>>): Boolean {
        var pond: Figure
        var knight: Figure
        var king: Figure

        var isInRange = false

        for (array in field) {
            if (array.contains('P')) {
                pond = Figure(ChessFigureType.POND, array.indexOf('P'), field.indexOf(array))
            } else if (array.contains('N')) {
                var knight = Figure(ChessFigureType.KNIGHT, array.indexOf('N'), field.indexOf(array))
            } else if (array.contains('K')) {
                var king = Figure(ChessFigureType.KING, array.indexOf('K'), field.indexOf(array))
            }
        }


//        if (pond. >= 0 && pondX >= 0) {
//            if (field[pondY + 1][pondX + 1].isLetter() || field[pondY + 1][inRangePond].isLetter()) {
//                isInRange = true
//            }
//        }


        return isInRange

    }
}

class Figure (
    val type: ChessFigureType,
    val x: Int,
    val y: Int
)

enum class ChessFigureType {
    KING,
    POND,
    KNIGHT;
}

fun isInRange(figure: Figure): Boolean {
    when (figure.type) {
        ChessFigureType.POND -> {}
        ChessFigureType.KING -> {}
        ChessFigureType.KNIGHT -> {}
    }
}