package Lesson_13

/*
Задача 2 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.
Дополни класс методом, который будет печатать информацию о контакте сообщением в одном println() и без использования
многострочного ввода такого типа (пример):
- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit
Вместо null значения, в консоль должна выводиться строка <не указано>.
 */

fun main() {
    val book = TelephoneBook22("Max", 89241234567)
    book.bookInfo()
}

class TelephoneBook22(
    val name: String,
    val number: Long,
    val company: String? = null
) {

    fun bookInfo() {
        println(
            """
            Имя: $name
            Номер: $number
            Компания: ${company ?: "не указано"}
        """.trimIndent()
        )
    }
}