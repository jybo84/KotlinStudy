package Lesson_16

/*
Задача 3 к Уроку 16

Создай класс, описывающий пользователя, который хранит поля логин и пароль.
Пароль не должен быть виден в теле главной функции, но должен быть способ проверить, что пароль введен верно.
Функция валидации должна принимать строку и возвращать результат проверки (и только его – без распечатки или генерации
других строк).

Выведи информацию о релевантности пароля в консоль.
 */

fun main() {
    val user = User("123", "max")
    println("Введите пароль")
    val userPas = readln()
    println("Введите логин")
    val userLogin = readln()
    user.checkPassword(userPas, userLogin)
}

class User(
    private val password: String,
    private val login: String
) {

    fun getPassword() = password
    fun getLogin() = login

    fun checkPassword(userPas: String, userLogin: String) {
        if (userPas.equals(getPassword()) && userLogin.equals(getLogin()))
            println("Валидация прошла успешно")
        else
            println("Пароль либо логин неверны")
    }
}