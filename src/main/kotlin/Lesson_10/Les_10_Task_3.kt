package Lesson_10

/*
Задача 3 к Уроку 10

Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно чередующихся цифр и
специальных символов. Например, 4#4%2!.
- пользователь сам задает длину пароля;
- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля и возвращающая
готовый пароль;
- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).
 */

fun main() {
    println("Давай сгенерируем пароль")
    Thread.sleep(1000)
    println("Введите длину пароля")
    val userLength = readln().toInt()
    println(generatePassword(userLength))
}

fun generatePassword(userNum: Int): String {
    val elementNumber = ('0'..'9')
    val elementChar = ('!'..'.')
    var totalPassword = ""

    for (el in 0 until userNum / 2) {
        totalPassword = totalPassword + elementNumber.random() + elementChar.random()
    }
    return totalPassword
}























