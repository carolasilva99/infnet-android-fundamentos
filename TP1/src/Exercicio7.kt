import java.util.*

fun main() {
    val word = "cafe".lowercase(Locale.getDefault())
    var value = 0

    word.forEachIndexed{ index, letter -> value += ((index + 1) * (letter.hashCode() - 96))}

    println(value)
}