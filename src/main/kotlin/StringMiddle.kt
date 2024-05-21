class StringMiddle {
    fun getMiddle(word: String): String {
        var middle = ""

        if (word.length % 2 == 0) {
            middle += word.toCharArray()[word.length / 2 - 1]
            middle += word.toCharArray()[word.length / 2]
            return middle
        } else {
            middle += word.toCharArray()[word.length / 2]
            return middle
        }
    }
}


