package Lesson_15

/*
Задача 5* к Уроку 15

В логике мобильной игры есть грузовые и легковые автомобили с такими параметрами:
- грузовые машины могут перевозить одного пассажира и 2 тонны груза;
- легковые не перевозят груз, но могут вместить до 3 пассажиров.
Создай интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.
- учитывай максимальное и текущее количество перевозимых людей или грузов;
- интерфейсы должны содержать методы загрузки и разгрузки пассажиров или грузов.
Спроектируй классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.
 */

fun main() {

    val car1 = PassengerCar()
    car1.loadInCar()
    car1.unloadCar()
    car1.move()
    println()

    val car2 = CargoCar()
    car2.loadInCar()
    car2.unloadCar()
    car2.move()
}


abstract class Vehicle() : PossibilityTransportCargo, PossibilityTransportHuman {

}

class PassengerCar(
    override val maxLoadCargo: Int = 0,
    override val maxLoadMen: Int = 3
) : Vehicle(), PossibilityLoad, Moveble {
    override fun loadInCar() {
        println("Я могу в салон посадить $maxLoadMen человек")
    }

    override fun unloadCar() {
        println("Я на остановке могу высадить $maxLoadMen человек")
    }

    override fun move() {
        println("Я маленький и шустрый. Могу лихачить и быстро ездить")
    }
}

class CargoCar(
    override val maxLoadCargo: Int = 2,
    override val maxLoadMen: Int = 1
) : Vehicle(), PossibilityLoad, Moveble {
    override fun loadInCar() {
        println("Я могу в кузов погрузить $maxLoadCargo тонн груза и $maxLoadMen человек")
    }

    override fun unloadCar() {
        println("Я из кузова могу высыпать $maxLoadCargo тонн песка")
    }

    override fun move() {
        println("Я большой и неповоротливый. Езжу медленно только по первой полосе")
    }
}

interface PossibilityTransportHuman {
    val maxLoadMen: Int
}

interface PossibilityTransportCargo {
    val maxLoadCargo: Int
}

interface PossibilityLoad {
    fun loadInCar()
    fun unloadCar()
}

interface Moveble {
    fun move()
}

