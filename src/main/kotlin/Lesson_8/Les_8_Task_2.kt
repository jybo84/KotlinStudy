package Lesson_8

/*
Задача 2 к Уроку 8

Представь, что ты работаешь над приложением с рецептами (кстати, это приложение мы вместе будем разрабатывать на
практике AndroidSprint). Напиши код, который проверяет, есть ли нужный ингредиент в рецепте.
 – создай массив, в котором будет храниться список ингредиентов для определенного блюда;
 – далее через консоль запроси у пользователя информацию об ингредиенте, который он хочет найти;
 – произведи поиск элемента по массиву, используя цикл for;
 – если ингредиент в списке есть, выведи в консоль сообщение - “Ингредиент [название] в рецепте есть”;
 – если нет, сообщать: “Такого ингредиента в рецепте нет”.
 */

fun main() {
    val ingridients = arrayOf("вода", "лимон", "чайный пакетик", "сахар")
    println("Введите искомый ингридиент")

    val userIngridients = readln()

    for (el in ingridients) {
        if (el == userIngridients) {
            println("Ингридиент ${userIngridients.uppercase()} ЕСТЬ в рецепте")
            return
        }
    }
    println("Ингридиента ${userIngridients.uppercase()} в рецепте НЕТ")
}
















