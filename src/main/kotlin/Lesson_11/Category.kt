package Lesson_11

class Category(
    val burgers: List<String>,
    val pizza: List<String>,
    val soup: List<String>,
    val salad: List<String>,
){

    fun burgerShow() = println(burgers)

    fun pizzaShow() = println(pizza)

    fun soupShow() = println(soup)

    fun saladShow() = println(salad)
    }
