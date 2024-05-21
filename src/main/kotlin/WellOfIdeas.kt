fun well(x: Array<String>): String {
    val ideas = x.filter { it == "good" }
    if (ideas.size > 2) {
        return "I smell a series!"
    } else if (ideas.size == 0) {
        return "Fail!"
    } else {
        return "Publish!"
    }
}