package Lesson_21

/*
Задача 1 к Уроку 21

Реализуй extension функцию для класса String, которая будет возвращать количество гласных букв в строке.
Назови функцию vowelCount. Например, для строки "hello" функция должна вернуть 2.
 */

fun main() {
    val word = "hello"
    word.vowelCount()
}

fun String.vowelCount() {
    var count = 0
    this.forEach { letter ->
        when (letter) {
            'a', 'e', 'i', 'o', 'u', 'y' -> count++
        }
    }
    println("В данной строке $count гласных букв")
}