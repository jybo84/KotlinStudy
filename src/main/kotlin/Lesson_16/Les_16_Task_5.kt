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
    character.getExtraHealth(100)

    val character1 = Character("Бражник")
    character1.getDamage(70)
    character1.characterInfo()
    character1.getDamage(70)

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

    private fun deathCharacter() {
        power = 0
        health = 0
        println("персонаж умер")
        println("ИГРА ЗАКОНЧИЛАСЬ")
    }

    fun getDamage(power: Int): Int {
        println("Удар по $name")
        val totalHealth = getHealth() - power
        setHealth(totalHealth)
        if (totalHealth < 0)
            deathCharacter()

        return totalHealth
    }

    fun getExtraHealth(tablet: Int): Int {
        val totalHealth = getHealth() + tablet
        setHealth(totalHealth)
        println("${name} съел волшебную таблетку. Теперь ${getHealth()} здоровья")
        return totalHealth
    }

    fun characterInfo() {
        println("персонаж $name Осталось $health здоровья мощность $power")
    }
}
