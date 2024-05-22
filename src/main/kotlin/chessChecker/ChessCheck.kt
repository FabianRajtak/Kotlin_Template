package chessChecker

class ChessCheck {

    fun checkMate(field: Array<Array<Char>>): Boolean {

        mapAllFigures(field)

        return false
    }

//    fun checkMate(field: Array<Array<Char>>): Boolean {
//        var knightCheckmate = false
//        var pondCheckmate = false
//        var rookCheckmate = false
//        var bishopCheckmate = false
//
//        for (array in field) {
//            if (array.any { it == 'N' }) {
//                var knight = Knight()
//                knightCheckmate = knight.inRange(field)
//            }
//
//            if (array.any { it == 'P' }) {
//                var pawnd = Pawnd()
//                pondCheckmate = pawnd.inRange(field)
//            }
//
//            if (array.any { it == 'R' }) {
//                var rook = Rook()
//                rookCheckmate = rook.inRange(field)
//            }
//
//            if (array.any { it == 'B' }) {
//                var bishop = Bishop()
//                rookCheckmate = bishop.inRange(field)
//            }
//        }
//
//    return knightCheckmate || pondCheckmate || rookCheckmate || bishopCheckmate
//
//    }
}

fun mapAllFigures(field: Array<Array<Char>>): List<Figure> {
    var figureList = mutableListOf<Figure>()

    for (array in field) {
        for (i in array) {
            if (i == 'P') {
                figureList.add(
                    Pawnd(
                        "${figureList.size}" + "Pawnd",
                        array.indexOf(i),
                        field.indexOf(array)
                    )
                )
            }
        }
    }

    figureList.forEach{ println(it.name)}

    return figureList.toList()
}
