package Lesson_11

/*
Задача 4 к Уроку 11

Дизайнер предоставил макет Android-приложения:
www.figma.com/file/89K5JomHGyIkUFUaBKRBXi/RecipesApp?type=design&node-id=1%3A181&mode=design&t=DsOaqqRfAeCTY2eN-1
Для представленных экранов спроектируй следующие сущности для хранения данных:
- Категория рецепта
- Рецепт
- Ингредиент
 */

fun main() {

    val categoryOfMenu = Category(
        listOf("бургер классический", "бургер с грибами"),
        listOf("Пицца с сыром", "Пицца с грибами"),
        listOf("шурпа", "борщ"),
        listOf("оливье", "шуба")
    )
    println("меню супов")
    categoryOfMenu.soupShow()
    println("меню салатов")
    categoryOfMenu.saladShow()
    println("Меню пицц")
    categoryOfMenu.pizzaShow()
    println("Меню бургеров")
    categoryOfMenu.burgerShow()
    val ingridients =
        Ingridient(mapOf("творого/гр" to 350, "яйцо/шт" to 2, "мука/ст.ложки" to 6, "сахар/т.ложки" to 2))
    println("Ингридиенты для приготовления")
    ingridients.ingridientsShow()
    println("Рецепт приготовления пиццы")
    val recipe = Recipe(
        mapOf(
            1 to "расскатывает тесто",
            2 to "мажем кетчуп",
            3 to "ложим помидоры и сыр",
            4 to "поставить в духовку"
        )
    )
    recipe.reciepOfPizzaShow()
}

class Category(
    val burgers: List<String>,
    val pizza: List<String>,
    val soup: List<String>,
    val salad: List<String>,
) {
    fun burgerShow() = println(burgers)
    fun pizzaShow() = println(pizza)
    fun soupShow() = println(soup)
    fun saladShow() = println(salad)
}

class Ingridient(
    val ingridient: Map<String, Int>
) {
    fun ingridientsShow() = println(ingridient)

}

class Recipe(
    val reciepOfPizza: Map<Int, String>
) {
    fun reciepOfPizzaShow() = println(reciepOfPizza)
}