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
        val gender = readln()


        var human = Human(name, gender )           // TODO здесь не получается
        listHuman.add(human)
    }
    listHuman.forEach { el -> el.humanInfo() }
}

class Human(private val name: String, gender: Gender) {

    fun humanInfo() {
        println("Имя хумана $name пол ${gender.title}")  // TODO здесь не видит почему то
    }
}


enum class Gender(var title: String) {
    MEN("мужчина"),
    WOMEN("женщина"),
    EUROPEAN("неопределен");

    fun getGender(text: String) {
        when (text) {
            "M" -> Gender.MEN.title
            "Ж" -> Gender.WOMEN.title
            "Н" -> Gender.EUROPEAN.title
        }
    }
}



