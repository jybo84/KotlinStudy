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
    order.managerStatusChange(true)
}

class Shop(
    private val numberOfOrder: Int,
    private var status: Boolean = false
) {
    override fun toString(): String {
        return "Заказ с номером $numberOfOrder, в статусе ${if (!status) "еще комплектуется" else "можно забирать"}"
    }

    private fun changeStatus(newStatus: Boolean): Boolean {
        status = newStatus
        println(
            "Статус заказа ${numberOfOrder} изменен на:" +
                    " ${if (newStatus) "Заказ - готов к выжаче" else "Заказ - eще компелктуется"}"
        )
        return newStatus
    }

    fun managerStatusChange(newStatus: Boolean) {
        println("Отправка запроса на изменение статуса заказа номер $numberOfOrder")
        changeStatus(newStatus)
    }
}