package Lesson_20

/*
Задача 2 к Уроку 20

В компьютерной игре игрок может подобрать лечебное зелье, которое восстанавливает всё его здоровье.
Для реализации программы понадобится создать простой класс игрока (у него должно быть имя, текущее и максимальное
здоровье).
– Напиши лямбда-функцию с явным указанием типа переменной, реализующую лечебное зелье. Функция должна принимать
в качестве параметра объект игрока.
– Создай экземпляр игрока с неполным здоровьем, примени к нему созданную лямбду-функцию.
 */

fun main() {

    val playerMax = Player("Max", 50, 100)

    val lamda: (Player) -> Unit = { player: Player -> player.currentHealth = player.maxHealth }

    lamda(playerMax)
    println(playerMax)

}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int) {
    override fun toString(): String {
        return "Имя игрока:$name, текущее здоровье: $currentHealth, максимальное здоровье: $maxHealth"
    }
}
