fun isPrimeNumber(number: Int): Boolean {
    var i = 2

    while (i <= number / 2) {
        if (number % i == 0) {
            return false
        }
        ++i
    }

    return true
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    val maskedNumbers = numbers.map { number -> if(isPrimeNumber(number)) 1 else 0 }

    println(maskedNumbers)
}