import data.STUB

fun main() {

//    val firstResult = STUB.getResultList(4)
//    println(firstResult.joinToString(" ") { it.variant })
//
//    firstResult[2].isActive = false
//
//    val newResult = STUB.getResultList(4)
//    println(newResult.joinToString(" ") { it.variant })
//    firstResult.mapIndexed { index, it ->
//        if (it.isActive) {
//            it.variant = newResult[index].variant
//        }
//    }
//    println(firstResult.joinToString(" ") { it.variant })

    println(
        """
            1. Кто?
            2. Какого пола?
            3. Какая профессия?
            4. Что делает?
            5. Где находится?
            ----------------------
            0. Погнали!

        """.trimIndent()
    )

    print("Выберите уровень сложности (1-5): ")
    val level = readln().toInt()
    val firstResult = STUB.getResultList()
    showResult(level, firstResult)

    var choice = 6
    while (choice != 0) {
        print("\nВыберите, какой пункт хотите оставить либо 0, если всё устраивает: ")
        choice = readln().toInt()
        if (choice == 0) {
            changeParameters(firstResult)
            showResult(level, firstResult)
        } else {
            if (firstResult[choice.minus(1)].isActive) {
                firstResult[choice.minus(1)].isActive = false
            } else if (!firstResult[choice.minus(1)].isActive) {
                firstResult[choice.minus(1)].isActive = true}
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

fun changeParameters(firstResult: List<Parameter>) {
    val newResult = STUB.getResultList()
    firstResult.mapIndexed { index, it ->
        if (it.isActive) {
            it.variant = newResult[index].variant
        }
    }
}