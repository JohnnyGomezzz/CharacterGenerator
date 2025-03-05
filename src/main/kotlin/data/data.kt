package data

import Characteristic

object STUB {

    private val result = listOf(
        Characteristic(
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
        Characteristic(
            variant = listOf(
                "мужского пола",
                "женского пола",
            ).random()
        ),
        Characteristic(
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
        Characteristic(
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
        Characteristic(
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

//    fun getResult(level: Int): String {
//        return result.take(level).joinToString(" ") { it.variant }
//    }
}