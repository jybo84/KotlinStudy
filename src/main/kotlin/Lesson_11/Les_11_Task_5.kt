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

    val mem1 = forum.createNewUser("Максим")
    val mem2 = forum.createNewUser("Иван")
    val mem3 = forum.createNewUser("Светлана")
    val mem4 = forum.createNewUser("Фридон")
    val mem5 = MemberForum("Какое то имя")
    println()
    forum.forumPrintInfo()
    println()

    forum.createNewMessage(MessageForum("Ребят привет. Я новый участник чата", mem1))
    forum.createNewMessage(MessageForum("Добро пожаловать", mem2))
    forum.createNewMessage(MessageForum("У нас тут строгие порядки", mem3))
    forum.createNewMessage(MessageForum("Ребят привет. Я тоже хочу к Вам", mem5))
    forum.createNewMessage(MessageForum("Быстрее приходи ко мне на курсовой проект", mem4))
    forum.createNewMessage(MessageForum("Я очень строгий чувак", mem2))
    forum.createNewMessage(MessageForum("Иван, можно приступать к курсовой ???", mem1))
    forum.createNewMessage(MessageForum("Да, приступай. Одну не решенную задачу прощаю. Потом решишь", mem2))
    forum.createNewMessage(MessageForum("Скоро у тебя будет свое PET андроид приожение. Я научу", mem4))

    println()

    forum.printThread()
}

data class Forum(val tittleForum: String) {

    private var id: Int = 0

    private val listMember = mutableListOf<MemberForum>()

    private val listChat = mutableListOf<MessageForum>()

    fun printThread() {
        for (chat in listChat) {
            println("${chat.memberForum.name.uppercase()}: ${chat.message}")
        }
    }

    fun createNewUser(name: String): MemberForum {
        id++
        val newMem = MemberForum(name, id)
        listMember.add(newMem)
        println("$name добавлен в список участников чата")
        return newMem
    }

    fun createNewMessage(messageForum: MessageForum) {
        if (listMember.any { it.id == messageForum.memberForum.id }) {
            listChat.add(messageForum)
        } else println("Вас нет в участниках чата. Попросите админа Вас добавить")
    }


    fun forumPrintInfo() {
        println(
            """   Форум: $tittleForum
участники форума: 
${listMember.joinToString("\n")}
        """.trimMargin()
        )
    }
}

data class MemberForum(val name: String, val id: Int = 0) {
    override fun toString(): String {
        return "имя -$name, id -$id"
    }
}

data class MessageForum(val message: String, val memberForum: MemberForum)