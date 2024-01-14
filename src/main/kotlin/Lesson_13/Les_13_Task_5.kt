package Lesson_13

/*
Задача 5* к Уроку 13

Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги) и измени его название для избегания
конфликтов.
Для получения номера программа считывает ввод пользователя с типом String по умолчанию. Приведи строку к типу Long.
Если пользователь ввел что-либо, кроме цифр — программа падает.
Необходимо воспроизвести ошибку и вывести ее название в консоль.
 */

fun main() {
    println("Введите номер")
    val userNumber = readln()
    userNumber.toLong()
    println(userNumber)
}

class ContactBook(
    val name: String,
    val number: Long,
    val company: String?,
) {

    override fun toString(): String {
        return """
            КОНТАКТ
            имя: $name
            телефон: $number
            работает: $company
        """.trimIndent()
    }
}