package Lesson_17

/*
Задача 1 к Уроку 17

Создай класс, описывающий элемент викторины. В primary конструкторе два текстовых свойства: вопрос и ответ.
Явно пропиши для вопроса геттер, для ответа геттер и сеттер.
 */

fun main() {
    val task = Quiz()
    println("Вопрос: ${task.question}")
    println("Правильный ответ: ${task.answer}")
}

class Quiz() {

    val question = "Язык програмирования для Android"
        get() = field

    var answer = "Kotlin"
        get() = field
        set(value) {
            field = value
        }
}