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
        Category.BURGERS.title, NameOfDish.CLASSICAL_BURGER.title, Ingredients().classicalBurgerIngredients
    )

    val dish2 = Menu(
        Category.SOUP.title, NameOfDish.CHICKEN_SOUP.title, Ingredients().chickenSoupIngredients
    )

    println(dish1)
    println()
    println(dish2)

}

data class Menu(

    val category: String,
    val nameOfDish: String,
    val ingredients: List<String>,

    ) {
    override fun toString(): String {
        return "категория: $category \nназвание блюда: $nameOfDish \nИнгридиенты: ${ingredients.joinToString(", ")}"
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

class Ingredients() {
    val classicalBurgerIngredients = listOf("булка", "котлета", "кетчуп", "майонез")
    val mushroomBurgerIngredients = listOf("булка", "котлета", "кетчуп", "майонез", "грибы")
    val classicPizzaIngredients = listOf("тесто", "колбаса", "сыр", "помидоры")
    val mushroomPizzaIngredients = listOf("тесто", "колбаса", "сыр", "помидоры", "грибы")
    val chickenSoupIngredients = listOf("вода", "соль", "яйцо", "курица")
    val borschIngredients = listOf("капуста", "картоха", "свекла", "мясо", "вода", "соль")
    val oliveIngredients = listOf("картоха", "горошек", "огурец", "морковка")
    val saladSeaCabbageIngredients = listOf("морская капуста")
}