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
    val contact1 = TelephoneContact("Max", 89241234511, "Яндекс")
    val contact2 = TelephoneContact("Ivan", 89241234522, "Яндекс")
    val contact3 = TelephoneContact("Sveta", 89241234533, "null")
    val contact4 = TelephoneContact("Oleg", 89241234544, null)
    val contact5 = TelephoneContact("Denis", 89241234555, null)
    val listContact = listOf(contact1, contact2, contact3, contact4, contact5)

    listContact.forEach { el -> el.companyInfo() }
}

data class TelephoneContact(
    val name: String,
    val number: Long,
    val company: String?,
) {

    fun companyInfo() {
        println("Компания: ${company ?: "не указано"}")
    }
}