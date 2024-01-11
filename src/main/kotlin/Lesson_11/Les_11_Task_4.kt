package Lesson_11

import java.awt.Menu

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
    val burger = Menu(category = )


    println(burger)

}

 class Menu(
    val category: Category,
//    val nameOfDish: String,
//    val ingredients: String,
//    val recipe: String,


)

data class Category(
    val burgers: String = "Бургеры",
    val pizza: String ="Пицца",
    val soup: String = "Суп",
    val salad: String = "Салат",
)

class NameOfDish(
    val classicBurger: String = "Бургер классический",
    val mushroomBurger: String = "Бургер с грибами",
    val classicPizza: String = "Классичееская пицца",
    val mushroomPizza: String = "Грибная пицца",
    val chickenSoup: String = "Куринный суп",
    val borsch: String = "Борщ",
    val olive: String = "Оливье",
    val saladSeaCabbage: String = "Салат из морской капусты"
)

class Ingredients(
   val classicBurgerIngredients: List<String> = listOf("булка", "котлета", "кетчуп", "майонез"),
   val mushroomBurgerIngredients: List<String> = listOf("булка", "котлета", "кетчуп", "майонез", "грибы"),
   val classicPizzaIngredients: List<String> = listOf("тесто", "колбаса", "сыр", "помидоры"),
   val mushroomPizzaIngredients: List<String> = listOf("тесто", "колбаса", "сыр", "помидоры", "грибы"),
   val chickenSoupIngredients: List<String> = listOf("вода", "соль", "яйцо", "курица"),
   val borschIngredients: List<String> = listOf("капуста", "картоха", "свекла", "мясо", "вода", "соль"),
   val oliveIngredients: List<String> = listOf("картоха", "горошек", "огурец", "морковка"),
   val saladSeaCabbageIngredients: List<String> = listOf("морская капуста"),
)

/*
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
    val ingridients = listOf("вода", "мука", "соль")

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
    val burgers: String = "Бургеры",
    val pizza: String ="Пицца",
    val soup: String = "Суп",
    val salad: String = "Салат",
) {
    fun burgerShow() = println(burgers)
    fun pizzaShow() = println(pizza)
    fun soupShow() = println(soup)
    fun saladShow() = println(salad)
}

//class Ingridient(
//
//) {
//    fun ingridientsShow() = println(ingridient)
//
//}

class Recipe(
    category: Category,
    val ingridient: Map<String, Int>,
    val reciepOfPizza: Map<Int, String>,
) {
    fun reciepOfPizzaShow() = println(reciepOfPizza)
}*/



//fun main() {
//
//    val categoryOfMenu = Category(
//        listOf("бургер классический", "бургер с грибами"),
//        listOf("Пицца с сыром", "Пицца с грибами"),
//        listOf("шурпа", "борщ"),
//        listOf("оливье", "шуба")
//    )
//    println("меню супов")
//    categoryOfMenu.soupShow()
//    println("меню салатов")
//    categoryOfMenu.saladShow()
//    println("Меню пицц")
//    categoryOfMenu.pizzaShow()
//    println("Меню бургеров")
//    categoryOfMenu.burgerShow()
//    val ingridients =
//        Ingridient(mapOf("творого/гр" to 350, "яйцо/шт" to 2, "мука/ст.ложки" to 6, "сахар/т.ложки" to 2))
//    println("Ингридиенты для приготовления")
//    ingridients.ingridientsShow()
//    println("Рецепт приготовления пиццы")
//    val recipe = Recipe(
//        mapOf(
//            1 to "расскатывает тесто",
//            2 to "мажем кетчуп",
//            3 to "ложим помидоры и сыр",
//            4 to "поставить в духовку"
//        )
//    )
//    recipe.reciepOfPizzaShow()
//}
//
//class Category(
//    val burgers: List<String>,
//    val pizza: List<String>,
//    val soup: List<String>,
//    val salad: List<String>,
//) {
//    fun burgerShow() = println(burgers)
//    fun pizzaShow() = println(pizza)
//    fun soupShow() = println(soup)
//    fun saladShow() = println(salad)
//}
//
//class Ingridient(
//    val ingridient: Map<String, Int>
//) {
//    fun ingridientsShow() = println(ingridient)
//
//}
//
//class Recipe(
//    val reciepOfPizza: Map<Int, String>
//) {
//    fun reciepOfPizzaShow() = println(reciepOfPizza)
//}