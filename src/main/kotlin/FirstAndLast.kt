fun firstReverseTry(arr: IntArray) : IntArray {
    if (arr.size < 2) {
        return arr
    }
    val temp = arr[0]
    arr[0] = arr[arr.size - 1]
    arr[arr.size - 1] = temp
    return arr
}
