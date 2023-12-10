package Lesson_13

/*
Задача 1 к Уроку 13

Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и компанию.
Номер телефона – целочисленное значение (Long).
При создании объекта компания может оставаться незаполненной. Вместо пустой строки поле может принимать null.
Все свойства класса не должны иметь инициализации по умолчанию.
 */

fun main() {
    val book = TelephoneBook()
    println(book)
}

class TelephoneBook() {
    val name: String = "Max"
    val number: Long = 89241234567
    val company: String? = null
    override fun toString(): String {
        return (" контакт $name номер телефона $number работает $company")
    }
}