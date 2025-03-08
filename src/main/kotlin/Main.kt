import data.STUB

fun main() {

    initUI()

    print("Выберите уровень сложности (1-5): ")
    val level = readln().toInt()
    val firstResult = STUB.getResultList()
    showResult(level, firstResult)

    while (true) {
        print("\nВыберите, какой пункт хотите оставить: ")
        when (val choice = readln().toInt()) {
            0 -> {
                changeParameters(firstResult)
                showResult(level, firstResult)
            }
            9 -> initUI()
            in 1..level -> {
                if (firstResult[choice.minus(1)].isActive) {
                    firstResult[choice.minus(1)].isActive = false
                } else if (!firstResult[choice.minus(1)].isActive) {
                    firstResult[choice.minus(1)].isActive = true
                }
                showResult(level, firstResult)
            }
            else -> println("Неверное значение! Выберите пункты, которые хотите оставить, либо 0 или 9")
        }
    }
}

fun initUI() {
    println(
        """
            1. Кто?
            2. Какого пола?
            3. Какая профессия?
            4. Что делает?
            5. Где находится?
        """.trimIndent()
    )
}

fun showResult(level: Int, firstResult: List<Parameter>) {
    var num = 1
    println()
    while (num <= level) {
        val parameter = firstResult[num.minus(1)]
        if (parameter.isActive) {
            println("$num. ${parameter.variant}")
        } else {
            println("V $num. ${parameter.variant}")
        }
        num += 1
    }
    println(
        """
            -----------------------
            0. Генерировать!
            -----------------------
            9. Очистить
        """.trimIndent()
    )
}

fun changeParameters(firstResult: List<Parameter>) {
    val newResult = STUB.getResultList()
    firstResult.mapIndexed { index, it ->
        if (it.isActive) {
            it.variant = newResult[index].variant
        }
    }
}