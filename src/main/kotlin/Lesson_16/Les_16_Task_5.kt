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
    val character = Character("Джэк Воробей")

    character.characterInfo()
    character.getDamage(70)
    character.characterInfo()
    character.getExtraHealth(10)
    character.getDamage(70)
    println()

    val character1 = Character("Бражник")

    character1.characterInfo()
    character1.getDeath()
}

class Character(
    private val name: String = "Задайте имя персонажу",
    private var health: Int = 100,
    private var power: Int = 50
) {

    fun getHealth() = health
    fun setHealth(newHealth: Int) {
        health = newHealth
    }

    fun getPower() = power
    fun setPower(newPower: Int) {
        power = newPower
    }

    fun getDeath() {
        power = 0
        health = 0
        println("персонаж умер")
        println("ИГРА ЗАКОНЧИЛАСЬ")
    }

    fun getDamage(power: Int): Character {
        println("Удар по $name")
        val character = Character()
        val totalHealth = getHealth() - power
        setHealth(totalHealth)
        if (totalHealth < 0)
            getDeath()

        return character
    }

    fun getExtraHealth(tablet: Int): Character {
        val character = Character()
        val totalHealth = getHealth() + tablet
        setHealth(totalHealth)
        println("${name} съел волшебную таблетку. Теперь ${getHealth()} здоровья")
        return character
    }

    fun characterInfo() {
        println("персонаж $name Осталось $health здоровья мощность $power")
    }
}
