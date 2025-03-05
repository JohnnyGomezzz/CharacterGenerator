import data.STUB

fun main() {

    print("Выберите уровень сложности (1-5):")

    val level = readln().toInt()

    println(STUB.getResult(level))
}