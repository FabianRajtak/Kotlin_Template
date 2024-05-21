class ChessCheck {
    fun checkMate(field: Array<Array<Char>>): Boolean {
        return field.any { it.contains('P') }
    }
}