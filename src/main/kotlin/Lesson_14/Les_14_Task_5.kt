package Lesson_14

import java.util.*

/*
Задача 5* к Уроку 14

  Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord. Класс должен иметь следующие методы:

  - addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;

- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения), дополнительно
принимает на вход parentMessageId для идентификации сообщения, под которым создается ветка обсуждения;

Сообщения чата должны храниться в списке, в классе Chat. Для создания сообщений соответствующих типов используй классы
Message и ChildMessage в соответствующей иерархии. У каждого типа сообщения должен быть id.

- printChat() — печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить для вывода табуляцию
и печатать его под родительским сообщением.

Используй groupBy() для группировки сообщений по parentMessageId, если
сообщение является экземпляром ChildMessage, или по id если это обычное сообщение.
 */

fun main() {
    val chat = Chat("Чат - Курс по Андроид разработке")
    chat.addMessage("Максим", "Привет. Я хочу стать Андроид разработчиком")
    chat.addMessage("Иван", "Отлично. Мы тебя научим.")
    chat.addMessage("Fridon", "Ты по адресу")
    chat.addMessage("Максим", "Что мне нужно делать?")
    chat.addMessage("Светлана", "Я тоже в команде Ивана и Fridom'а ")

    chat.addThreadMessage("Иван", "Тебе нужно решить 100 задач", 4)
    chat.addThreadMessage("Fridon", "Со мной ты будешь делать курсовую", 4)
    chat.addThreadMessage("Иван", "Потом займемся АндроидСтудией", 4)
    chat.addThreadMessage("Fridon", "Я тебя подготовлю к собеседованию", 4)

    chat.printChat()
}

class Chat(private val title: String) {
    private var id = 0
    private val listChat = mutableListOf<Message>()

    private val listChildChat = mutableListOf<ChildMessage>()

    fun addMessage(name: String, text: String) {
        id++
        val message = Message(name, text, id)
        listChat.add(message)
    }

    fun addThreadMessage(name: String, text: String, parentId: Int) {
        id++
        val childMessage = ChildMessage(name, text, id, parentId)
        listChildChat.add(childMessage)
    }

    fun printChat() {
        println(title)
        val groupChildMessage = listChildChat.groupBy { it.parentId }

        for (element in listChat) {
            println("id ${element.id}. ${element.name}: ${element.text}")
            groupChildMessage[element.id]?.forEach {
                println("\tid " + ("${it.id}. ${it.name}: ${it.text}").uppercase(Locale.getDefault()))
            }
        }
    }
}

open class Message(
    val name: String,
    val text: String,
    val id: Int
) {
    override fun toString(): String {
        return "Message(name='$name', text='$text', id=$id)\n"
    }
}

class ChildMessage(
    name: String,
    text: String,
    id: Int,
    val parentId: Int
) : Message(name, text, id)