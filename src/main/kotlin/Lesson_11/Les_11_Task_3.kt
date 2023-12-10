package Lesson_11

/*
Задача 3 к Уроку 11

Прокачиваем абстрактное мышление. Задача на проектирование сущностей для упрощенной версии приложения социальной сети,
в которой общаются только голосом. Требуется описать сущности и имитировать действия методами.
Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты” для общения по интересам.
В карточке “комнаты” отображается:
- обложка;
- название;
- список участников — отображаются в виде аватарок. При долгом нажатии на аватар подсветится его никнейм. Рядом с
аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего: “разговаривает”, “микрофон выключен”,
“пользователь заглушен”.
После проектирования создай объект комнаты с произвольными данными.
 */

fun main() {
    val m1 = Members("Max", "Разговаривает")
    val m2 = Members("Ivan", "Микрофон выключен")
    val m3 = Members("Sveta", "Пользователь заглушен")

    val room_1 = ChatRoom(
        cover = "it",
        title = "любителей Kotlin",
        listUser = listOf(m1, m2, m3)

    )
    println()
    room_1.roomInfo()
}

class ChatRoom(

    val cover: String,
    val title: String,
    val listUser: List<Members>,

    ) {
    fun roomInfo() {
        println("В форуме $cover, в комнате $title состоят участники: ${listUser.joinToString()}")
    }
}

data class Members(
    val name: String,
    val status: String,
) {
    override fun toString(): String {
        return ("$name статус $status")
    }
}