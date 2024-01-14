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

    val listCont = mutableListOf<TelNote>()

    while (true) {
        println("Введите имя контакта")
        val userName = readln()
        println("введите номер")
        val userNum = readln().toLongOrNull()
        println("Введите компанию")
        val userCompany: String = readln()

        userNum ?: println("ВЫ НЕ ВВЕЛИ НОМЕР ТЕЛЕФОНА. КОНТАКТ ДОБАВЛЕН НЕ БУДЕТ")
        userNum?.let { TelNote(userName, it, userCompany) }?.let { listCont.add(it) }

        println("Ещё будите добавлят контакт? да/нет")
        val next = readln()
        if (next.equals("нет", ignoreCase = true))
            break
    }

    println(listCont)

}

class TelNote(val name: String, private val number: Long, private val company: String?) {

    override fun toString(): String {
        return """
            |
            |    КОНТАКТ
            |ИМЯ: $name
            |ТЕЛЕФОН: $number
            |КОМПАНИЯ: $company
            |
        """.trimMargin()
    }
}