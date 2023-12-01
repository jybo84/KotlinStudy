package Lesson_10

/*
Задача 2 к Уроку 10

Для регистрации в приложении пользователь придумывает логин и пароль. И логин, и пароль должны содержать в себе хотя
бы 4 символа. Если всё верно, программа выводит приветственное сообщение.
- считывай логин и пароль с консоли поочередно;
- вынеси в отдельную функцию валидацию длины введенных данных;
- если пароль или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
 */

fun main() {
    generationLogin()
    generationPassword()
}

fun generationLogin(): String {
    println("Придумайте пароль")
    val userLogin = readln()
    val checkLogin = userLogin.map { it }
    if (checkLogin.size < 4)
        println("Логин не достаточно длинный")
    else println("Логин прошел валидацию")
    return userLogin
}

fun generationPassword(): String {
    println("Придумайте валидацию")
    val userPassword = readln()
    val checkPassword = userPassword.map { it }
    if (checkPassword.size < 4)
        println("Пароль не достточно длинный")
    else println("Пароль прошел валидацию")
    return userPassword
}


