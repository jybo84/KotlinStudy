package Lesson_15

/*
Задача 3 к Уроку 15

На форуме есть два типа пользователей – обычные пользователи и администраторы.
Пользователи могут читать форум и писать сообщения. Администраторы дополнительно могут удалять сообщения и пользователей.
Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс. У абстрактного класса должны
быть соответствующие общие поля и методы. Действия на форуме отобрази сообщениями в консоль.
 */

fun main() {
    val user = SimpleUser()
    user.write()
    user.read()
    println()

    val admin = Administrator()
    admin.write()
    admin.read()
    admin.canDeleteMessage()
}

abstract class User() : SimplePossibility {

}

open class SimpleUser() : User() {

}

class Administrator() : User(), AdministratorPossibility {

}

interface SimplePossibility {
    fun write() {
        println("могу писать в форуме")
    }

    fun read() {
        println("могу читать в форуме")
    }
}

interface AdministratorPossibility {
    fun canDeleteMessage() {
        println("Я могу удалять сообщения других пользователей")
    }
}

