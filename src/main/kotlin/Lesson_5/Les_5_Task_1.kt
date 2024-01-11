package Lesson_5

/*
Задача 1 к Уроку 5

Нужно написать часть модуля для авторизации пользователя. Для входа в приложение пользователь должен доказать,
что он не бот. Для этого программа предлагает решить простой математический пример – сложить два числа (сообщить
об этом пользователю).
Имитируй эти действия в консоли, путем считывания данных с клавиатуры. При успешном решении вход в программу
символизируется сообщением “Добро пожаловать!". В противном случае вывести сообщение "Доступ запрещен."
*/

fun main() {
    val firstNum = 2
    val secondNum = 2
    val res = firstNum + secondNum
    println(
        """
        Подтвердите что Вы не бот
        Решите задачу -> $firstNum + $secondNum
    """.trimIndent()
    )
    val userNum = readln().toInt()

    val total = if(userNum == res)"Добро пожаловать!" else "Доступ запрещен"
    println(total)
}

