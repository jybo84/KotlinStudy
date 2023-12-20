package Lesson_16

/*
Задача 4 к Уроку 16

Создай класс, описывающий заказ в интернет-магазине. В заказе должны быть номер заказа и статус готовности.
Номер заказа должен быть недоступен для изменения.
Создай метод, который меняет статус заказа. Поменять статус заказа можно только отправив заявку менеджеру.
Имитируй это действие отдельной публичной функцией. Она будет принимать новый статус и обращаться к внутреннему методу
класса для изменения статуса.
 */

fun main() {
    val order = Shop(123)
    println(order)
    order.changeStatus(order.sandMessage("Готово"))
    println(order)
}

class Shop(private val numberOfOrder: Int, var status: Boolean = false) {

    fun changeStatus(message: String) {
        if (message.equals("Готово", ignoreCase = true))
            status = true
    }

    fun sandMessage(text: String): String {
        return text
    }

    override fun toString(): String {
        return "Заказ с номером $numberOfOrder, в статусе ${if (!status) "еще комплектуется" else "готов можно забирать"}"
    }
}