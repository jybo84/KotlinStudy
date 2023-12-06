package Lesson_10

/*
Задача 2 к Уроку 10

Для регистрации в приложении пользователь придумывает логин и пароль. И логин, и пароль должны содержать в себе хотя
бы 4 символа. Если всё верно, программа выводит приветственное сообщение.
- считывай логин и пароль с консоли поочередно;
- вынеси в отдельную функцию валидацию длины введенных данных;
- если пароль или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
 */

val BOTTOM_LEVEL = 4
fun main() {
  println("Придумайте логин")
    val userLogin = readln()
    println("Придумайте пароль")
    val userPassword = readln()

    check(userLogin, userPassword)
}

fun check(userLogin: String, userPassword: String) {
    val res = if (userLogin.length < BOTTOM_LEVEL && userPassword.length < BOTTOM_LEVEL)
        "Логин или пароль недостаточно длинные" else "Приветсвенное сообщение"
    println(res)
}






