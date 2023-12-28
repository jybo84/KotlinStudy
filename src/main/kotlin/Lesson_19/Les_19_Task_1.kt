package Lesson_19


/*
Задача 1 к Уроку 19

В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish),
петушок (Siamese fighting fish). Напиши enum класс, перечисляющий этих рыб. Сообщи пользователю, каких рыб он может
добавить в свой аквариум, распечатав список в консоль.
 */

fun main() {
    println("на данный момент доступны следующие виды рыб:")

    for (fish in Fish.entries)
        println(fish.title)
}

enum class Fish(val title: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

