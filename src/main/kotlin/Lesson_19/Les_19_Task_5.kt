package Lesson_19

/*
Задача 5* к Уроку 19

Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.
Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum. После ввода 5 человек, список выводится
в консоль.
При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны).

 */
fun main() {
    val listHuman = mutableListOf<Human>()

    while (listHuman.size < 5) {
        println("Введите имя хумана")
        val name = readln()
        println("пол какой")
        val gender = readln().toInt()         // TODO здесь как то надо обрабатывать
        when (gender) {
            1 -> Gender.MEN.title
            2 -> Gender.WOMEN.title
            3 -> Gender.EUROPEAN.title
        }
        for (gen in Gender.entries)  // TODO здесь как то надо обрабатывать
        var human = Human(name, gender)           // TODO здесь как то надо обрабатывать
        listHuman.add(human)
    }
    listHuman.forEach { el -> el.humanInfo() }
}

class Human(private val name: String, private val gender: String) {

    fun humanInfo() {
        println("Имя хумана $name пол $gender")
    }
}


enum class Gender(var title: String) {
    MEN("муж"),
    WOMEN("жен"),
    EUROPEAN("европеец"),
}


