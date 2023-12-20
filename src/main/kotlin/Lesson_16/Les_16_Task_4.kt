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
    changeStatus("Готово", order)
    println(order)
}

class Shop(private val numberOfOrder: Int, private var status: Boolean = false) {

    fun setStatus(value: Boolean) {
        status = value
    }

    override fun toString(): String {
        return "Заказ с номером $numberOfOrder, в статусе ${if (!status) "еще комплектуется" else "готов можно забирать"}"
    }
}

private fun changeStatus(message: String, shop: Shop): Shop {
    if (message.equals("Готово", ignoreCase = true))
        shop.setStatus(true)
    return shop
}