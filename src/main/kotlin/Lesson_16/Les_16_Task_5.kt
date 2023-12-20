package Lesson_16

/*
Задача 5* к Уроку 16

Для игры требуется создать класс игрока. С полями: имя, здоровье и сила удара. Здоровье должно изменяться только через
методы получения урона и лечения.
Добавить приватный метод, который вызывается, если при получении урона заканчивается здоровье. Смерть обнуляет силу
удара, здоровье и не позволяет лечиться.
Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.
 */

fun main() {
    val character = Character()

    damage(character)
    character.characterInfo()
    getWell(character)
    character.characterInfo()
    damage(character)
    character.characterInfo()
    damage(character)
    character.characterInfo()
}

class Character(
    private val name: String = "max",
    private var health: Int = 100,
    private var power: Int = 50,
) {

    fun getHealth() = health
    fun setHealth(newHealth: Int) {
        health = newHealth
    }

    fun getPower() = power
    fun setPower(newPower: Int) {
        power = newPower
    }

    fun characterInfo() {
        println("персонаж $name Осталось $health здоровья мощность $power")
    }
}

fun damage(character: Character): Character {
    val totalHealth = character.getHealth() - character.getPower()
    character.setHealth(totalHealth)
    if (totalHealth > 0)
        println("Осталось ${totalHealth} здоровья")
    else {
        character.setPower(0)
        character.setHealth(0)
        println("персонаж умер")
        println("ИГРА ЗАКОНЧИЛАСЬ")
    }
    return character
}

fun getWell(character: Character): Character {
    val tablet = 25
    val totalHealth = character.getHealth() + tablet
    character.setHealth(totalHealth)
    println("Теперь ${totalHealth} здоровья")
    return character
}



