package Lesson_14

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

    val chat = Chat("Котлин")
    println(chat.listChat)

    chat.addMessage(Message("Привет", "Максим"))
    chat.addMessage(Message("ОК", "Федя"))
    chat.addMessage(Message("Пока", "Маня"))
    chat.addThreadMessage(ChildMessage("         Добавленный текст", "новый участник"), 6)

    chat.printChat()
}


data class Chat(val title: String) {
    private var id = 0

    val listChat = mutableMapOf<Int, Message>()

    fun addMessage(message: Message): Map<Int, Message> {
        id++
        listChat.put(id, message)
        return listChat
    }

    fun addThreadMessage(childMessage: ChildMessage, parentMessageId: Int): Map<Int, Message> {
        id++
        if (parentMessageId in listChat.keys) {
            listChat.put(id, childMessage)
        }
        return listChat
    }


    fun printChat() {
        println(listChat.map { "id:${it.key} ${it.value}" }.joinToString("\n"))
    }
}


open class Message(val text: String, val name: String) {
    override fun toString(): String {
        return "\u001B[32m${name.uppercase()}: \u001B[33m $text"
    }
}

class ChildMessage(text: String, name: String) : Message(text, name)
