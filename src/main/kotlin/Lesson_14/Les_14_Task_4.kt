package Lesson_14

/*
Задача 4 к Уроку 14

В компьютерной игре существуют планеты. У некоторых из них есть спутники.
Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.
Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.
- планета должна хранить список спутников.
Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.
 */

fun main() {

    val planet =
        Planet("Планета", false, true, listOf(Sputnik("Спутник1", false, false), Sputnik("Спутник2", true, true)))
    println(planet)
    println(planet.name)

    planet.list.forEach { el -> println(el.name) }
}

open class CosmicBody(
    open val name: String,
    open val isHaveAtmosphere: Boolean,
    open val isCanLanding: Boolean
)

data class Planet(
    override val name: String,
    override val isHaveAtmosphere: Boolean,
    override val isCanLanding: Boolean,
    val list: List<Sputnik>,
) : CosmicBody(name, isHaveAtmosphere, isCanLanding)


data class Sputnik(
    override val name: String,
    override val isHaveAtmosphere: Boolean,
    override val isCanLanding: Boolean,
) : CosmicBody(name, isHaveAtmosphere, isCanLanding)