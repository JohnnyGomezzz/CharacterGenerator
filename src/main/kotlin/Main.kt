import data.STUB

fun main() {

    println(
        """
            1. Кто?
            2. Какого пола?
            3. Какая профессия?
            4. Что делает?
            5. Где находится?
            
        """.trimIndent()
    )

    print("Выберите уровень сложности (1-5): ")
    val level = readln().toInt()
    val firstResult: MutableList<Parameter> = STUB.getResultOfChars(level)
    showResult(level, firstResult)

    var choice = 6
    while (choice != 0) {
        print("\nВыберите, какой пункт хотите оставить либо 0, если всё устраивает: ")
        choice = readln().toInt()
        if (choice == 0) {
            println(firstResult.joinToString(" ") {it.variant})
        } else {
            firstResult[choice.minus(1)].isActive = false
            STUB.changeChar(firstResult)
            showResult(level, firstResult)
        }
    }
}

fun showResult(level: Int, firstResult: List<Parameter>) {
    var num = 1
    while (num <= level) {
        val parameter = firstResult[num.minus(1)]
        if (parameter.isActive) {
            println("$num. ${parameter.variant}")
        } else {
            println("V $num. ${parameter.variant}")
        }
        num += 1
    }
}