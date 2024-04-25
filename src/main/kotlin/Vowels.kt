class Vowels {
    fun countVowels(givenString: String): Number{
        val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
        var vowelCount = 0
        val stringArray = givenString.toCharArray()
        for(num in 0..< givenString.length) {
            if (stringArray[num] == vowels[0] || stringArray[num] == vowels[1] ||
                stringArray[num] == vowels[2] || stringArray[num] == vowels[3] ||
                stringArray[num] == vowels[4]) {
                vowelCount++
            }
        }
        return vowelCount
    }

    fun countBetter(givenString: String): Number {
        val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
        return givenString.filter { char -> vowels.contains(char)}.length
    }

}

fun main() {
    val vowels = Vowels()
    println(vowels.countVowels("abracadabra"))
    println(vowels.countBetter("abracadabra"))
}