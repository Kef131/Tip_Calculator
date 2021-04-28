fun main() {
    var indexThe = -1
    val phrase = readLine()!!
    for (i in 0..phrase.lastIndex - 2) {
        if ("${phrase[i]}${phrase[i + 1]}${phrase[i + 2]}".toLowerCase() == "the") {
            indexThe = i
            break
        }
    }
    println(indexThe)
}
