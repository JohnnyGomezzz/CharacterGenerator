package data

import Parameter

object STUB {

    private val base = listOf(
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
    )

    private val gender = listOf(
        "мужского пола",
        "женского пола"
    )

    private val profession = listOf(
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
    )

    private val action = listOf(
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
    )

    private val place = listOf(
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
    )

    fun getResultList(): List<Parameter> {
        val result = listOf(
            Parameter(variant = base.random()),
            Parameter(variant = gender.random()),
            Parameter(variant = profession.random()),
            Parameter(variant = action.random()),
            Parameter(variant = place.random()),
        )
        return result
    }
}