package Lesson_11

/*
Задача 1 к Уроку 11

Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация об уникальном
идентификаторе, логине, пароле и почте. Названием может быть, например, User. Создай два экземпляра класса с
произвольными данными и выведи в консоль содержимое их полей.

 */

fun main() {
    val first = User(id = 1, login = "ivan", password = "111zzz", email = "ivan@mail.ru")
    val second = User(id = 2, login = "max", password = "222xxx", email = "max@mail.ru")

    println()
    println("Создан пользователь с id-${second.id} логином-${second.login} паролем-${second.password} и эл.почтой-${second.email}")
    println()
    println("Создан пользователь с id-${first.id} логином-${first.login} паролем-${first.password} и эл.почтой-${first.email}")

}

class User(
    val login: String,
    val password: String,
    val email: String,
    val id: Int,
)