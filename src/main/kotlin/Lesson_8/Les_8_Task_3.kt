package Lesson_8

/*
Задача 3 к Уроку 8

Используй условие из предыдущей задачи. Нужно доработать код, который проверяет наличие ингредиента в рецепте.
Однако, не используя цикл для поиска.
 */

fun main() {
    val ingridients = arrayOf("вода", "лимон", "чайный пакетик", "сахар")
    println("Введите искомый ингридиент")

    val userIngridients = readln()

   // 1-й вариант через встроенный метод
    if(ingridients.contains(userIngridients)) println("ингридиент $userIngridients в рецепте есть")else println("ингридиента нет")

    // 2-й вариант через поиск в диапозоне
    if (userIngridients in ingridients) println("ингридиент $userIngridients в рецепте есть")else println("ингридиента нет")

}
