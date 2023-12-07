package Lesson_11

class User_2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun userInfo() {
        println("Информация о пользователе: id-$id, логин-$login, пароль-$password, почта-$email")
    }

    fun fixBio() {
        println("Заполните поле bio")
        bio = readln()
        println("Информация о пользователе: id-$id, логин-$login, пароль-$password, почта-$email, $bio")
    }

    fun changePassword() {
        do {
            println("Введите Ваш пароль")
            val usPas = readln()
            if (usPas != password) {
                println("Пароль не совпадает")
            }
        } while (usPas != password)
        println(
            """
                Отлично, Вы ввели правильный пароль
                ПОМЕНЯЙТЕ ПАРОЛЬ
            """.trimIndent()
        )
        password = readln()
        println("Ваш пароль изменен")
    }
}