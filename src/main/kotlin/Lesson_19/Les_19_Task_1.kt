package Lesson_19


/*
Задача 1 к Уроку 19

В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish),
петушок (Siamese fighting fish). Напиши enum класс, перечисляющий этих рыб. Сообщи пользователю, каких рыб он может
добавить в свой аквариум, распечатав список в консоль.
 */

fun main() {
    println("на данный момент доступны следующие виды рыб:")

    val dataFromServer = listOf(1, 2, 3, 4)

    for (i in dataFromServer) {
        when (i) {
            Fish.GUPPY.num -> showInfoFish(Fish.GUPPY)
            Fish.ANGELFISH.num -> showInfoFish(Fish.ANGELFISH)
            Fish.GOLDFISH.num -> showInfoFish(Fish.GOLDFISH)
            Fish.SIAMESE_FIGHTING_FISH.num -> showInfoFish(Fish.SIAMESE_FIGHTING_FISH)
        }
    }
}

enum class Fish(val num: Int) {
    GUPPY(1),
    ANGELFISH(2),
    GOLDFISH(3),
    SIAMESE_FIGHTING_FISH(4),
}

fun showInfoFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("гуппи")
        Fish.ANGELFISH -> println("скалярия")
        Fish.GOLDFISH -> println("золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("петушок")
    }
}