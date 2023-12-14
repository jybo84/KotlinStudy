package Lesson_13

/*
Задача 1 к Уроку 13

Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и компанию.
Номер телефона – целочисленное значение (Long).
При создании объекта компания может оставаться незаполненной. Вместо пустой строки поле может принимать null.
Все свойства класса не должны иметь инициализации по умолчанию.
 */

fun main() {
    val book = TelephoneBook("Max", 9241234567, null)
    println(book)
}

class TelephoneBook(
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