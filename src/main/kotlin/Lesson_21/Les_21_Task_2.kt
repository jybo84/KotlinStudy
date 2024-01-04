package Lesson_21

/*
Задача 2 к Уроку 21

Создай extension функцию evenNumbersSum для списка чисел, которая будет возвращать сумму всех четных чисел в списке.
 */

fun main() {

    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(number.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    this.forEach { el ->
        if (el % 2 == 0)
            sum += el
    }
    return sum
}



