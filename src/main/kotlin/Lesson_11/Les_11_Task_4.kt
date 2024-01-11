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
    val dish1 = Menu(
        Category.BURGERS.title, NameOfDish.CLASSICAL_BURGER.title,
        Ingredients.CLASSICAL_BURGER_INGREDIENTS
    )
    println(dish1)

}

data class Menu(

    val category: String,
    val nameOfDish: String,
    //val ingredients: String,
    val ingredients: Ingredients,
    //val recipe: String,
) {
    override fun toString(): String {
        return "категория: $category название блюда: $nameOfDish ингридиенты: $ingredients"
    }
}

enum class Category(var title: String) {
    BURGERS("БУРГЕРЫ"),
    PIZZA("ПИЦЦЦА"),
    SOUP("СУП"),
    SALAD("САЛАТ"),
}

enum class NameOfDish(var title: String) {
    CLASSICAL_BURGER("Бургер классический"),
    MUSHROOM_BURGER("Бургер с грибами"),
    CLASSICAL_PIZZA("Классичееская пицца"),
    MUSHROOM_PIZZA("Грибная пицца"),
    CHICKEN_SOUP("Куринный суп"),
    BORSCH("Борщ"),
    OLIVE("Оливье"),
    SALAD_SEA_CABBAGE("Салат из морской капусты"),

}

enum class Ingredients(list: List<String>) {
    CLASSICAL_BURGER_INGREDIENTS(listOf("булка", "котлета", "кетчуп", "майонез")),
    MUSHROOM_BURGER_INGREDIENTS(listOf("булка", "котлета", "кетчуп", "майонез", "грибы")),
    CLASSIC_PIZZA_INGREDIENTS(listOf("тесто", "колбаса", "сыр", "помидоры")),
    MUSHROOM_PIZZA_INGREDIENTS(listOf("тесто", "колбаса", "сыр", "помидоры", "грибы")),
    CHICKEN_SOUP_INGREDIENTS(listOf("вода", "соль", "яйцо", "курица")),
    BORSCH_INGREDIENTS(listOf("капуста", "картоха", "свекла", "мясо", "вода", "соль")),
    OLIVE_INGREDIENTS(listOf("картоха", "горошек", "огурец", "морковка")),
    SALAD_SEA_CABBAGE_INGREDIENTS(listOf("морская капуста")),
}

fun fff(ingredients: String){
    for (el in ingredients) println(el)
}