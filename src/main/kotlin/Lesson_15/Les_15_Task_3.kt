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
    user.write("Я могу писать сообщения")
    user.read("Я могу читать сообщения")
    println()

    val admin = Administrator()
    admin.deleteUser()
    admin.deleteMessage()
}

abstract class User : SimplePossibility {

}

open class SimpleUser : User() {

}

class Administrator : User(), AdministratorPossibility {

}

interface SimplePossibility {
    fun write(message: String) {
        println(message)
    }

    fun read(text: String) {
        println(text)
    }
}

interface AdministratorPossibility {
    fun deleteUser() {
        println("Я могу удалить пользователей которые постоянно шлют спам")
    }

    fun deleteMessage() {
        println("Я слежу за лексикой и при необходимости удаляю сообщения пользователей")
    }
}

