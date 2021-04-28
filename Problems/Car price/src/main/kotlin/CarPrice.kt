import kotlin.math.absoluteValue

fun priceCar(old: Int = 5, passed: Int = 100_000, speed: Int = 120, auto: Int = 0): Int {
    var price = 20_000
    price -= old * 2000
    price = if (speed < 120) price - (120 - speed) * 100 else price + (120 - speed).absoluteValue * 100
    price -= passed / 10_000 * 200
    price = if (auto == 1) price + 1500 else price
    return price
}
fun main() {
    val parameter = readLine()!!
    val value = readLine()!!.toInt()
    println(when (parameter) {
        "old" -> priceCar(old = value)
        "passed" -> priceCar(passed = value)
        "speed" -> priceCar(speed = value)
        "auto" -> priceCar(auto = value)
        else -> ""
    })
}