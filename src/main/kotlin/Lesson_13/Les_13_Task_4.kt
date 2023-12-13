package Lesson_13

/*
Задача 4 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
Программа должна заполнять контакты в телефонную книгу (отдельный список объектов), пока пользователь не напишет
“стоп” (игнорируй регистр).
- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и такая запись не должна добавляться;
- для приведения введенного номера к числу используй toLongOrNull();
- при записи поля с компанией предлагай пользователю пропуск заполнения, нажав Enter;
- если пользователь не заполнил компанию, то в объект записывать null.
Выведи созданные объекты в консоль методом класса.
 */

fun main() {
    var listContact = mutableListOf<TelephoneBasa>()
    val www = addNumber(listContact)

    showList(www)
    println()

}

fun addNumber(list: List<Any>): List<Any> {
    val ccc = mutableListOf<Any>()
    while (true) {

        println("введите имя")
        val name = readlnOrNull().toString()
        println("Введите номер телефона")
        val number: Long? = readln().toLongOrNull()
        println("Веведите компанию. ( Данныый пункт не является обязательным)")
        val company = readlnOrNull().toString()

        val contact = TelephoneBasa(name, number, company)

        ccc.add(contact)

        println("Добавляем новый контакт (если нет завершите операцию вызовом \"НЕТ\" )")
        val answer = readln()
        if (answer.equals("нет", ignoreCase = true))
            break
    }
    return ccc
}

fun showList(list: List<Any>) {
    list.forEach { el -> println(el) }
}

data class TelephoneBasa(
    var name: String?,
    var number: Long?,
    var company: String?,
) {

    override fun toString(): String {
        return """
                КАРТОЧКА КОНТАКТА
            Имя: $name
            Номер: $number
            Компания: ${company ?: "нет инфы"}
            ___________________________________
        """.trimIndent()
    }
}