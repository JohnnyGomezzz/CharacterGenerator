import data.STUB

class CharacterGenerator() {
    private var level: Int = 0
    private var firstResult: List<Parameter> = listOf()

    fun start() {
        initUI()
        generation()
    }

    private fun initUI() {
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
        level = readln().toInt()
        firstResult = STUB.getResultList()
        showResult()
    }

    private fun showResult() {
        var num = 1

        println()
        while (num <= level) {
            val parameter = firstResult[num.minus(1)]
            if (parameter.isActive) {
                println("$num. ${parameter.variant}")
            } else {
                println("$num. ${parameter.variant}\tV")
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

    private fun changeParameters() {
        val newResult = STUB.getResultList()
        firstResult.mapIndexed { index, it ->
            if (it.isActive) {
                it.variant = newResult[index].variant
            }
        }
    }

    private fun generation() {

        while (true) {
            print("\nВыберите, какой пункт хотите оставить: ")
            when (val choice = readln()) {
                "0" -> {
                    changeParameters()
                    showResult()
                }

                "9" -> initUI()

                in "1"..level.toString() -> {
                    firstResult[choice.toInt().minus(1)].isActive = !firstResult[choice.toInt().minus(1)].isActive
                    showResult()
                }

                else -> println("Неверное значение! Выберите пункты, которые хотите оставить, либо 0 или 9")
            }
        }
    }

}