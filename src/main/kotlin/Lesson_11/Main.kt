package Lesson_11

fun main() {
    val first = User(id = 1, login = "ivan", password = "111zzz", email = "ivan@mail.ru")
    val second = User(id = 2, login = "max", password = "222xxx", email = "max@mail.ru")

    println()
    println("Создан пользователь с id-${first.id} логином-${first.login} паролем-${first.password} и эл.почтой-${first.email}")
    println()
    println("Создан пользователь с id-${second.id} логином-${second.login} паролем-${second.password} и эл.почтой-${second.email}")
}