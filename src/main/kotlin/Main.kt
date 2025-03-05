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

    val firstResult = STUB.getResult(level)
    var num = 1
    while (num <= level) {
        println("$num. ${firstResult[num.minus(1)]}")
        num += 1
    }
}