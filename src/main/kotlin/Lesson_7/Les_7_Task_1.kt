package Lesson_7

/*
Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр и строчных
букв латинского алфавита (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.
 */

fun main() {
    val let1 = (1..10).random()
    val let2 = ('a'..'z').random()
    val let3 = (1..10).random()
    val let4 = ('a'..'z').random()
    val let5 = (1..10).random()
    val let6 = ('a'..'z').random()

    val password = "$let1$let2$let3$let4$let5$let6"
    println(password)

}


