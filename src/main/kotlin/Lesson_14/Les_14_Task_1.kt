package Lesson_14

/*
Задача 1 к Уроку 14

В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол. Все корабли построены на основе лайнера, но у
каждого свой функционал и дополнительные свойства.
У грузовых скорость меньше, а грузоподъемность больше. У ледоколов ниже и скорость, и вместительность, но они могут
колоть лёд. Лайнер может вмещать наибольшее количество пассажиров.
- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
- создай по 1 экземпляру каждого типа корабля.
 */

fun main() {
    val ship1 = LinerShip(100, 100)
    ship1.haveSkill()
    println()

    val ship2 = CargoShip(50, 50)
    ship2.haveSkill()
    println()

    val ship3 = IceBreakerShip(25, 15)
    ship3.haveSkill()
}

open class LinerShip(
    val speed: Int,
    val capacity: Int,
) {
    open fun haveSkill() {
        println("Я умею ходить по воде со скоростью $speed км/ч и перевезти $capacity человек")
    }
}

class CargoShip(speed: Int, capacity: Int) : LinerShip(speed, capacity) {
    override fun haveSkill() {
        println("Я умею ходить по воде со скоростью $speed км/ч и перевезти $capacity тонн груза")
    }
}

class IceBreakerShip(speed: Int, capacity: Int) : LinerShip(speed, capacity) {
    override fun haveSkill() {
        println("Я хожу по воде всего $speed км/ч, могу перевезти всего $capacity зато я умею ломать лед")
    }
}
