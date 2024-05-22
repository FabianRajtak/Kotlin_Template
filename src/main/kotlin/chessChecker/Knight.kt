//package chessChecker
//
//class Knight() : Figure() {
//    override fun inRange(field: Array<Array<Char>>): Boolean {
//        var x = 0
//        var y = 0
//
//        for (array in field) {
//            if (array.contains('N')) {
//                x = array.indexOf('N')
//                y = field.indexOf(array)
//            }
//        }
//
//        return field[numberInFieldRange(y+2)][numberInFieldRange(x - 1)] == 'K'
//    }
//
//    private fun numberInFieldRange(number: Int): Int {
//        return when {
//            number < 1 -> 0
//            number in 1..6 -> number
//            else -> 7
//        }
//    }
//}