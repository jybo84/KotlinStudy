package Lesson_9

/*
Задача 4 к Уроку 9

Напиши программу, которая один раз запрашивает у пользователя пять названий ингредиентов блюда в одной строке,
разделяя их запятыми (с пробелом).
- запроси у пользователя 5 ингредиентов, перечисленных через “, ” (запятая с пробелом) и сохрани их в список,
где каждый ингредиент — отдельный элемент;
- отсортируй полученный список по алфавиту и выведи его в консоль;
- используй тот метод сортировки, который возвращает новую отсортированную коллекцию.
 */

fun main() {
    println("Введите 5 ингридиентов")
    val userIngridient = readln()

    val userIngridientSplit = userIngridient.split(", ")

    println("Отсортированный список ${userIngridientSplit.sorted().joinToString(", ")}")
    // применил joinToString, что б вывод был  одной строкой, а не списком
}


// Старый способ (критика)
/*fun main() {
    println("Введите 5 ингридиентов, через запятую")
    val listIngrid = mutableListOf<String>()

    for (el in 0..4) {
        listIngrid.add(readln())
    }
    print("Список Ваших ингридиентов ${listIngrid.joinToString(", ")}")
    val newListIngrid = listIngrid.sorted()
    println()
    print("Отсортированный Список  ${newListIngrid.joinToString(", ")}")

    println()
    newListIngrid.forEach{el-> println(el) }
}

 */