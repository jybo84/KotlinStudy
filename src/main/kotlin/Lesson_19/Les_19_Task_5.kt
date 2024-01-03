package Lesson_19

/*
Задача 5* к Уроку 19

Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.
Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum. После ввода 5 человек, список выводится
в консоль.
При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны).

 */
fun main() {
    println(
        """                Инструкция
        |пол может быть М Ж на русской раскладке клавиатуры
    """.trimMargin()
    )
    println()

    val listHuman = mutableListOf<Human>()

    while (listHuman.size < 5) {
        println("Введите имя человека")
        val name = readln()
        println("Введите пол (согласно инструкции)")
        val gender = getGender(readln())

        val human = Human(name, gender)
        listHuman.add(human)
    }
    listHuman.forEach { el -> el.humanInfo() }
}

class Human(private val name: String, val gender: Gender) {

    fun humanInfo() {
        println("Имя человека: $name пол: ${gender.title}")
    }
}

enum class Gender(var title: String) {
    MEN("мужской"),
    WOMEN("женский"),
    EUROPEAN("неопределен");
}

fun getGender(text: String): Gender {
    return when (text) {
        "м" -> Gender.MEN
        "ж" -> Gender.WOMEN
        else -> Gender.EUROPEAN
    }
}




