package Lesson_21


/*
Задача 5* к Уроку 21

Игра имеет систему прокачки персонажей по различным навыкам. Опыт в каждом навыке хранится в виде пары ключ-значение,
где ключ — это название навыка (String), а значение — количество очков опыта (Int).
Создай extension функцию для интерфейса Map с названием maxCategory, которая будет возвращать название навыка,
в котором у игрока наибольшее количество очков опыта. Если два или более навыка имеют одинаковое максимальное значение,
функция должна возвращать любой из них.
 */

fun main() {

    val listExperience = mapOf("power" to 50, "speed" to 70, "health" to 90)
    println(listExperience.maxCategory())
}


fun Map<String, Int>.maxCategory(): Int {
    val maxValues = this.values.max()
    return maxValues
}