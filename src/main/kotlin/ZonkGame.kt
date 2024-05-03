class ZonkGame {

    private var diceList = mutableListOf<Int>()

    fun calculateScore(dice: IntArray): Int {
        fillNumbersList(dice)
        var score = 0
        score += findStraight(dice)
        score += findThreePairs(dice)
        score += findThree(diceList)
        score += findFour(dice)
        score += findFive(dice)
        score += findSix(dice)
        score = forEveryOneAndFive(dice, score)

        return score
    }

    fun fillNumbersList(dice: IntArray) {
        diceList = dice.toMutableList()
    }

    fun findStraight(dice: IntArray): Int {
        val diceSet = dice.toSet().sorted()
        var score = 0
        if (diceSet.size == 6) {
            score += 1000
        }
        return score
    }

    fun findThreePairs(dice: IntArray): Int {
        val diceList = dice.sorted().groupBy { it }.values.toList()
        var score = 0
        if (diceList.size == 3 && diceList.all { it.size == 2 }) {
            score += 750
        }
        return score
    }

    fun findThree(diceList: MutableList<Int>): Int {
        val diceList = diceList.sorted().groupBy { it }.values.toList()
        var score = 0
        if (diceList.any { it.size == 3 }) {
            val three = diceList.first { it.size == 3 }
            when (three[0]) {
                1 -> score = 1000
                2 -> score = 200
                3 -> score = 300
                4 -> score = 400
                5 -> score = 500
                6 -> score = 600
            }
        }
        return score
    }

    fun findFour(dice: IntArray): Int {
        val diceList = dice.sorted().groupBy { it }.values.toList()
        var score = 0
        if (diceList.any { it.size == 4 }) {
            val four = diceList.first { it.size == 4 }
            when (four[0]) {
                1 -> score = 2000
                2 -> score = 400
                3 -> score = 600
                4 -> score = 800
                5 -> score = 1000
                6 -> score = 1200
            }
        }
        return score
    }

    fun findFive(dice: IntArray): Int {
        val diceList = dice.sorted().groupBy { it }.values.toList()
        var score = 0
        if (diceList.any { it.size == 5 }) {
            val five = diceList.first { it.size == 5 }
            when (five[0]) {
                1 -> score += 3000
                2 -> score += 600
                3 -> score += 900
                4 -> score += 1200
                5 -> score += 1500
                6 -> score += 1800
            }
        }
        return score
    }

    fun findSix(dice: IntArray): Int {
        val diceList = dice.sorted().groupBy { it }.values.toList()
        var score = 0
        if (diceList.any { it.size == 6 }) {
            val six = diceList.first { it.size == 6 }
            when (six[0]) {
                1 -> score += 4000
                2 -> score += 800
                3 -> score += 1200
                4 -> score += 1600
                5 -> score += 2000
                6 -> score += 2400
            }
        }
        return score
    }

    fun forEveryOne(dice: IntArray, score: Int): Int {
        var scoreOne = score
        if (scoreOne == 0 && dice.contains(1)) {
            val numberOfOnes = dice.count { it == 1 }
            scoreOne += numberOfOnes * 100
        }
        return scoreOne
    }

    fun forEveryFive(dice: IntArray, score: Int): Int {
        var scoreFive = score
        if (scoreFive == 0 && dice.contains(5)) {
            val numberOfFives = dice.count { it == 5 }
            scoreFive += numberOfFives * 50
        }
        return scoreFive
    }

    fun forEveryOneAndFive(dice: IntArray, score: Int): Int {
        var score1and5 = score
        if (score1and5 == 0) {
            score1and5 = dice.count { it == 5 } * 50 + dice.count { it == 1 } * 100
        }
        return score1and5
    }

    fun calculateOneDice(dice: IntArray): Int {
        var score = 0

        if (dice.contains(1)) {
            score += 100
        } else if (dice.contains(5)) {
            score += 50
        } else {
            score += 0
        }
        return score
    }


}

fun getScore(dice: IntArray): Int {
    val zonkGame = ZonkGame()
    if (dice.size == 1) {
        return zonkGame.calculateOneDice(dice)
    } else {
        return zonkGame.calculateScore(dice)
    }
}

fun main() {

    val test = intArrayOf(1, 2, 3, 4, 5, 6)
    val zonkGame = ZonkGame()
    println(zonkGame.calculateScore(test))

}