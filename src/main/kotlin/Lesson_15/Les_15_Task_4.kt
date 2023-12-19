package Lesson_15

/*
Задача 4 к Уроку 15

На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним. Все товары имеют
название и количество единиц на складе.
Для инструментов есть возможность поиска соответствующих комплектующих.
Опиши классы для категорий товаров. Имитируй процесс поиска текстовым сообщением «Выполняется поиск».
Для выноса логики поиска используй интерфейс.
 */

fun main() {
    val accordion = Tool("гармошка", 3)
    accordion.productInfo()
    accordion.canSearch()
    println()

    val keys = Components("клавиши", 100)
    keys.productInfo()

}

abstract class Product() {
    abstract val name: String
    abstract val number: Int

    fun productInfo() {
        println("На складе имеется $name в количестве $number единиц")
    }
}

class Tool(override val name: String, override val number: Int) : Product(), CanSearchable {
    override fun canSearch() {
        println("Выполняется поиск ")
    }
}

class Components(override val name: String, override val number: Int) : Product() {

}

interface CanSearchable {
    fun canSearch()
}