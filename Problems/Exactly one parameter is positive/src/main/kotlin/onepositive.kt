fun main() {
    var onePostive = false
    for (i in 0..2) {
        if (readLine()!!.toInt() > 0) {
            if (onePostive == true) {
                print(false)
                return
            }
            onePostive = true
        }
    }
    println(true)
}