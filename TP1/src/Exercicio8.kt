fun main() {
    val word = "cafe"

    // Contains procura um conjunto de caracteres na string
    println(word.contains("c"))
    println(word.contains("1"))
    println(word.contains("af"))

    // isNullOrEmpty verifica se a string está vazia ou é nula
    var isNullOrEmpty: String? = null

    println(isNullOrEmpty.isNullOrEmpty())

    isNullOrEmpty = ""
    println(isNullOrEmpty.isNullOrEmpty())

    isNullOrEmpty = "teste"
    println(isNullOrEmpty.isNullOrEmpty())

    // subList pega uma pequena parte determinada da string
    val subListTest = "QueroPegarApenasAPalavraTesteDestaString"
    println(subListTest.subSequence(24, 29))
}