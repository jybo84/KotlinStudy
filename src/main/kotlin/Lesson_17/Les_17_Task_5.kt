package Lesson_17
/*
Задача 5* к Уроку 17

Класс описывает пользователя и хранит свойства логин и пароль (без инициализации по умолчанию).
- при попытке изменить пароль, в консоль должно выводиться «Вы не можете изменить пароль».
- при попытке прочитать пароль – вместо букв должны отображаться звездочки (по количеству символов пароля).
- при изменении логина в консоли должно печататься сообщение об успешной смене логина.

Создай пользователя с произвольными данными и протестируй изменение логина и пароля. Вся реализация должна
быть на сеттерах и геттерах.

 */

fun main() {
    val user = User()
    println(user.login)
    println(user.password)
    println()
    user.login = "MAXIM"
    println(user.login)
    user.password = "222"
    println(user.password)
}

class User() {
    var login = "max"
        set(value) {
            println("Логин успешно изменен")
            field = value
        }


    var password = "123"
        get() {
            var str = field.length
            field = ""
            while (str > 0) {
                field = field + "*"
                str--
            }
            return field
        }
        set(value) {
            field = "Вы не можете изменить пароль"
        }
}
