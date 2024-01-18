package Lesson_20

/*
Задача 4 к Уроку 20

В разрабатываемом приложении мы реализуем список элементов. Изначально он представлен списком строк.
При помощи map преобразуй его в список лямбд, каждая из которых печатает в консоль:
“Нажат элемент [название_элемента]”.
“Нажми” каждый четный элемент списка.
 */

fun main() {

    val number = listOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять")




    val listNumberLamb: List<() -> Unit> = number.map { val lamda = { println("нажат $it")}
   lamda
    }


        println(listNumberLamb.joinToString("\n"))

        listNumberLamb.mapIndexed { index, it -> if (index % 2 == 0) println("нажми $it") }
    }


