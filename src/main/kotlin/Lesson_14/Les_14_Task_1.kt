package Lesson_14

<<<<<<< HEAD

=======
>>>>>>> origin/KS-14-1
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
    val ship1 = ShipLiner(100, 100)
    ship1.haveSkill()
    println("___________________________________")

    val ship2 = ShipCargo(50, 50)
    ship2.haveSkill()
    println("___________________________________")

    val ship3 = ShipIceBreaker(30, 15)
    ship3.haveSkill()
    println("___________________________________")
}

open class Ship(
    open val speed: Int,
    open val capacity: Int,
) {
    open fun haveSkill() {
        println("Я умею ходить по воде со скоростью $speed и перевезти $capacity")
    }
}

class ShipLiner(speed: Int, capacity: Int) : Ship(speed, capacity) {
    override fun haveSkill() {
        println("Я умею ходить по воде со скоростью $speed км/ч и перевезти $capacity человек")
    }
}

class ShipCargo(speed: Int, capacity: Int) : Ship(speed, capacity) {
    override fun haveSkill() {
        println("Я умею ходить по воде со скоростью $speed км/ч и перевезти $capacity тонн груза")
    }
}

class ShipIceBreaker(speed: Int, capacity: Int) : Ship(speed, capacity) {
    override fun haveSkill() {
        println("Я хожу по воде всего $speed км/ч, могу перевезти всего $capacity зато я умею ломать лед")
    }
<<<<<<< HEAD
}
=======
}

>>>>>>> origin/KS-14-1
