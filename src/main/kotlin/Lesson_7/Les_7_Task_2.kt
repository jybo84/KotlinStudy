package Lesson_7

/*
Задача 2 к Уроку 7

Создай программу, имитирующую авторизацию по коду из смс. Программа будет “высылать” код из четырех цифр
(случайное число от 1000 до 9999). Выведи его в консоль с текстом “Ваш код авторизации: N”. Далее программа
запрашивает ввод кода, чтобы авторизоваться.
Если код введён неверно – программа вышлет новый (отобразит в консоли) и снова будет запрашивать его ввод для попытки
авторизации. Если код введен верно – программа отображает приветствие и завершает работу.
 */

fun main() {
    val secretCod = (1000..9999).random()
    println("Ваш код авторизации: $secretCod")

    println("Для авторизации введите код который мы Вам направили ранее")

    while (true) {
        val userCod = readln().toInt()
        if (userCod != secretCod) {
            println("Ошибка. Вы ввели неверный код")
            Thread.sleep(1000)
            println("Попробуйте снова")
        } else
            break
    }
    println("Приветсвуем Вас. Вы вошли в систему")
}