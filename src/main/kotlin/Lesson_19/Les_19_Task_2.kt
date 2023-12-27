package Lesson_19
/*
Задача 2 к Уроку 19

В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.
 – создай enum класс с категориями;
 – создай метод внутри enum, который вернет текстовое название категории для пользователя;
 – создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод, который выводит
 инфо о товаре. Вызови его для нескольких созданных товаров;
 – для вывода информации о товаре, для категории используй метод определения категории.
 */

fun main() {

    val pen = Product("ручка", 111, Category.CHANCELLERY)
    pen.productInfo()
    println()

    val blouse = Product("кофта", 222, Category.DRESS)
    blouse.productInfo()
    println()

    val milk = Product("молоко", 333, Category.DIFFERENT)
    milk.productInfo()
}

class Product(private val title: String, private val id: Int, private val category: Category) {

    fun productInfo() {
        println(
            "Товар \nназвание: $title \nидентификационный номер: $id " +
                    "\nнаходится в категории: ${category.categoryInfo(category)}"
        )
    }
}

enum class Category() {
    DRESS,
    CHANCELLERY,
    DIFFERENT;


    fun categoryInfo(category: Category): String {
        when (category) {
            DRESS -> return "ОДЕЖДА"
            CHANCELLERY -> return "КАНЦЕЛЯРИЯ"
            DIFFERENT -> return "РАЗНОЕ"
        }
    }
}