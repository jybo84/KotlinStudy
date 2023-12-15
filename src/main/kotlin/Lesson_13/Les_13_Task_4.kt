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
    val total = mutableListOf<Any>()
    showList(addContactInTelephoneBook())
}

fun showList(list: List<Any>) {
    list.forEach { el -> println(el) }
}

data class TelephoneBasa(
    var name: String?,
    var number: Unit,
    var company: String?,
) {

    override fun toString(): String {
        return """
                КАРТОЧКА КОНТАКТА
            Имя: ${name}
            Номер: ${number}
            Компания: ${company}
            ___________________________________
        """.trimIndent()
    }
}

fun getName(): String? {
    println("Введите имя")
    val name: String? = readlnOrNull()
    if (name != null) {
        if (name.isEmpty()) return null
    }
    return name
}

fun getNumber(): Long? {
    println("Введите номер")
    val num = readln().toLongOrNull()
    if (num == null)
        println("Вы не ввели данные")
    return num
}

fun getCompany(): String? {
    Thread.sleep(1000)
    println("Введите компанию (ПОЛЕ НЕ ЯВЛЯЕТСЯ ОБЯЗАТЕЛЬНЫМ)")
    val company: String? = readlnOrNull()
    if (company != null) {
        if (company.isEmpty()) return null
    }
    return company
}

fun checkGetNumber() {
    val check = getNumber()
    if(check == null)
        return
    else
        check
}

fun addContactInTelephoneBook(): List<Any> {
    val list = mutableListOf<Any>()
    do {
        val contact = TelephoneBasa(getName(), checkGetNumber(), getCompany())
        list.add(contact)
        println("Еще будите добавлять контакт или СТОП")
        val answer = readln()
    } while (!answer.equals("стоп", ignoreCase = true))

    return list
}