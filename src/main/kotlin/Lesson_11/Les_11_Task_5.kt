package Lesson_11

/*
Задача 5* к Уроку 11

Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для сущностей “Член форума”
(с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Фабрика” для создания пользователей и сообщений форума. Напрямую объекты не создаются, логика должна
быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового пользователя в общий
список и одновременно возвращает новый объект. Генерация id-шников новых пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если такой пользователь
есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от каждого
пользователя.
 */


fun main() {

    val forum = Forum("Любители Kotlin")

    val mem1 = forum.createNewUser("ZZZ")
    forum.forumPrintInfo()
    val mem2 = forum.createNewUser("XXX")
    forum.forumPrintInfo()
    val mem3 = forum.createNewUser("NNN")
    forum.forumPrintInfo()
    val mem4 =forum.createNewUser("Max")
    forum.forumPrintInfo()

    println(forum.listMember)

    forum.createNewMessage(MessageForum("sdd", mem2 ))



}

data class Forum(val tittleForum: String) {

    val listMember = mutableListOf<MemberForum>()

    val listChat = mutableListOf<String>()

    //TODO здесь надо вернуть
    fun createNewUser(name: String): List<MemberForum> {
        listMember.add(MemberForum(name))
        println("$name добавлен в список участников чата")
        return listMember
    }

    fun createNewMessage(messageForum: MessageForum) {
        val ccc = mutableListOf<Int>()
        listMember.forEach { el ->
            el.id
            ccc.add(el.id)
        }
        if (ccc.contains(messageForum.memberForum.id)) {
            listChat.add(messageForum.message)
        } else println("Вас нет в участниках чата. Попросите админа Вас добавить")

        println(listChat)

    }

//    - printThread() печатает в консоль все сообщения добавленные на форум в формате:
//
//    автор: сообщение
//    автор: сообщение
    fun forumPrintInfo() {
        println(
            """   Форум: $tittleForum
            | участники форума: $listMember
        """.trimMargin()
        )
    }
}

data class MemberForum(val name: String, val id: Int = (1..99).random())

data class MessageForum(val message: String, val memberForum: MemberForum)











