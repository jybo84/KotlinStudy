package Lesson_20

/*
Задача 4 к Уроку 20

В разрабатываемом приложении мы реализуем список элементов. Изначально он представлен списком строк.
При помощи map преобразуй его в список лямбд, каждая из которых печатает в консоль:
“Нажат элемент [название_элемента]”.
“Нажми” каждый четный элемент списка.
 */

fun main() {

    val element = listOf("Январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август")

    val lamdaList = { list: List<String> -> for (s in list) println("Нажат элемент $s") }

    val lamdaOdd =
        { list: List<String> -> list.mapIndexed { index, s -> if (index % 2 != 0) println(s) } }


    lamdaList(element)
    println("__________________")
    lamdaOdd(element)
}




