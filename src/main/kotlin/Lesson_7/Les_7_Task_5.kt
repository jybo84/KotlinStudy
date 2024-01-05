package Lesson_7

/*
Задача 5* к Уроку 7

Создай программу, которая генерирует более сложные пароли.
 – пароль должен содержать цифры, строчные и заглавные буквы;
 – цифры и буквы должны располагаться в случайном порядке;
- минимальная длина пароля 6 символов;
- максимальная длина пароля должна задаваться пользователем.
 */

fun main() {
    println("Введите длину пароля, но не менее 6 символов")
    do {
        val userPasswordLength = readln().toInt()
        if (userPasswordLength >= 6) {
            val password = (0..< userPasswordLength).map {
                ((0..9) + ('a'..'z') + ('A'..'Z')).random()
            }
            println(password.joinToString(""))
        } else
            println("Длина пароля должна быть не менее 6 символов")
    } while (userPasswordLength < 6)
}


