package Lesson_20

/*
Задача 5* к Уроку 20

Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
Модификатор устанавливается функцией setModifier(), принимающей лямбду.
Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно). Реализуй модификатор, инвертирующий
слова робота.
В результате в главной функции должен быть воспроизведен такой алгоритм:
– Вызов say(). Метод печатает одну фразу в обычном виде.
– Вызов setModifier(). Устанавливает переданный в него модификатор строки.
– Вызов say(). Метод выводит одну фразу в инвертированном виде.
 */

fun main() {
    val phrases =
        listOf("С новым годом", "С праздником", "Поздравляю", "Желаю всего хорошего", "С наступившим новым годом")
    val robot = Robot()

    val one = robot.say(phrases)

    println(one)
    println(robot.setModifier(one, lamda))
}

class Robot() {

    fun say(list: List<String>): String {
        return list.random()
    }


    fun setModifier(text: String, lamda: (String) -> String): String {
        return lamda(text)
    }
}

val lamda = { text: String -> text.reversed() }
