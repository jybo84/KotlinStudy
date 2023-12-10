package Lesson_11

/*
Задача 2 к Уроку 11

Скопируй класс User из первой задачи и назови User2. Добавь к классу новое необязательное свойство bio и несколько
методов:
- вывод информации о пользователе в консоль;
- считывание из консоли текста и запись в поле bio;
- изменение пароля — сначала запросить текущий пароль, и, если он введен верно, запросить новый. Записать его в поле и
сообщить, что пароль изменен;
Далее создай объект, заполни информацию “о себе” и замени пароль. В конце выведи обновленную информацию о пользователе.
 */


fun main() {
    val max = User2(1, "max", "123zzz", "jybo@mail.ru")
    max.userInfo()
    max.fixBio()
    max.changePassword()
    max.userInfo()
}

class User2(
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