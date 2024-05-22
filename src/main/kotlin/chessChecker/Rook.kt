//package chessChecker
//
//class Rook() : Figure() {
//    private var x = 0
//    private var y = 0
//
//    override fun inRange(field: Array<Array<Char>>): Boolean {
//
//        for (array in field) {
//            if (array.contains('R')) {
//                x = array.indexOf('R')
//                y = field.indexOf(array)
//            }
//        }
//
//        return checkIfKingOnXAxis(field) || checkIfKingOnYAxis(field)
//    }
//
//    private fun checkIfKingOnXAxis(field: Array<Array<Char>>) =
//        field[y].contains('K')
//
//    private fun checkIfKingOnYAxis(field: Array<Array<Char>>): Boolean {
//        for (i in 0..7) {
//            if (field[i][x] == 'K') {
//                return true
//
//            }
//        }
//        return false
//    }
//}