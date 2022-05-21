fun main() {
    val numbers = listOf(0, 2, 3, 4, 5, 4, 3, 2, 1, 1)
    val evens = numbers.filter { number -> number % 2 == 0 }
    val odds = numbers.filter { number -> number % 2 != 0 }

    val product = odds.reduce { acc, next -> acc * next }
    val sum = evens.reduce { acc, next -> acc + next }

    println(sum)
    println(product)
}