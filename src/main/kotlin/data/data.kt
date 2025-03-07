package data

import Parameter

object STUB {

    private val result = mutableListOf(
        Parameter(
            variant = listOf(
                "человек",
                "андроид",
                "птица",
                "змея",
                "кот",
                "собака",
                "крыса",
                "ящер",
                "змея",
                "енот",
            ).random()
        ),
        Parameter(
            variant = listOf(
                "мужского пола",
                "женского пола",
            ).random()
        ),
        Parameter(
            variant = listOf(
                "врач",
                "волшебник",
                "военный",
                "пират",
                "космонавт",
                "пилот",
                "шахтёр",
                "художник",
                "поэт",
                "программист",
            ).random()
        ),
        Parameter(
            variant = listOf(
                "стоит",
                "бежит",
                "ест",
                "сидит",
                "лежит",
                "прыгает",
                "пьёт",
                "пинает",
                "поёт",
                "играет",
            ).random()
        ),
        Parameter(
            variant = listOf(
                "в квартире",
                "в лесу",
                "в пещере",
                "в автомобиле",
                "в цирке",
                "на корабле",
                "в самолёте",
                "под водой",
                "в поезде",
                "в метро",
            ).random()
        ),
    )

    fun getResult(level: Int): List<String> {
        return result.take(level).map { it.variant }
    }

    fun getResultOfChars(level: Int): MutableList<Parameter> {
        return result.take(level).toMutableList()
    }

    fun changeChar(firstResult: MutableList<Parameter>) {
        firstResult.mapIndexed { index, parameter ->
            if (parameter.isActive) parameter.variant = result[index].variant
        }
    }
}