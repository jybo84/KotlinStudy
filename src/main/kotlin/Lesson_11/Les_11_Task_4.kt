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

    val burger = Category(
        "БУРГЕРЫ", "булка с котлетой",
        Recipe(
            "классический", Ingredients(
                listOf("майонез", "кетчуп", "булка", "котлета"),
                "выкладываем слоями"
            )
        )
    )

    burger.printDish()
}

data class Category(val name: String, val description: String, val recipe: Recipe)


data class Recipe(val nameDish: String, val ingredients: Ingredients)


data class Ingredients(val list: List<String>, val descriptionCooking: String)


fun Category.printDish() {
    println(
        "КАТЕГОРИЯ: $name \nОПИСАНИЕ БЛЮДА: $description  \nНАЗВАНИЕ БЛЮДА: ${recipe.nameDish} " +
                "\nИНГРИДИЕНТЫ: ${(recipe.ingredients.list).joinToString(" ")} " +
                "\nРЕЦЕПТ ПРИГОТОВЛЕНИЯ: ${recipe.ingredients.descriptionCooking}"
    )
}