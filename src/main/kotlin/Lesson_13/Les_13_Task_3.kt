package Lesson_13

/*
Задача 3 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.
- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.
 */

fun main() {
    val listContact = mutableListOf(
        TelephoneContact("Max", 89241234511, "Яндекс"),
        TelephoneContact("Ivan", 89241234522, "Яндекс"),
        TelephoneContact("Sveta", 89241234533, "null"),
        TelephoneContact("Oleg", 89241234544),
        TelephoneContact("Denis", 89241234555),
    )

    listContact.forEach { el -> el.companyInfo() }
}

data class TelephoneContact(
    val name: String,
    val number: Long,
    val company: String? = null,
) {

    fun companyInfo() {
        println("Компания: ${company ?: "не указано"}")
    }
}