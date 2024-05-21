class ArrayGrow {

    fun grow(arr: IntArray): Int {
        var number = arr[0] * arr[1]
        for (i in 2..<arr.size) {
            number += number * arr[i]
        }
        return number
    }

}