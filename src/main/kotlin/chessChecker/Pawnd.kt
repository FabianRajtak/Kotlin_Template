package chessChecker

class Pawnd(name: String, x: Int, y: Int, type: FigureType = FigureType.PAWND): Figure(name, x, y, type) {
//    private var x = 0
//    private var y = 0
//    override fun inRange(field: Array<Array<Char>>): Boolean {
//
//
//        for (array in field) {
//            if (array.contains('P')) {
//                x = array.indexOf('P')
//                y = field.indexOf(array)
//            }
//        }
//
//        return when (x) {
//            in 1..6 -> { field[y + 1][x + 1].isLetter() || field[y + 1][x - 1].isLetter() }
//            0 -> {
//                field[y + 1][1].isLetter()}
//            else -> field[y + 1][6].isLetter()
//        }
//    }
}