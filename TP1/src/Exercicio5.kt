fun factorial(number: Int = 1): Long {
    var i = 1
    var factorial: Long = 1
    while (i <= number) {
        factorial *= i.toLong()
        i++
    }

    return factorial
}

fun main() {
    println(factorial(5))
}