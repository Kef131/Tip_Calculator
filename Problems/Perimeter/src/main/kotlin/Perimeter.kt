import kotlin.math.pow
import kotlin.math.sqrt

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = 0.0, y4: Double = 0.0): Double {
    // Get distance
    val a = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    val b = sqrt((x3 - x2).pow(2) + (y3 - y2).pow(2))

    // Triangle
    return if (x4 == 0.0 && y4 == 0.0) {
        val c = sqrt((x1 - x3).pow(2) + (y1 - y3).pow(2))
        a + b + c
    } else { // quadrilateral
        val c = sqrt((x4 - x3).pow(2) + (y4 - y3).pow(2))
        val d = sqrt((x1 - x4).pow(2) + (y1 - y4).pow(2))
        a + b + c + d
    }
}