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
    println()

    val car2 = CargoCar()
    car2.loadInCar()
    car2.unloadCar()
}


abstract class Vehicle() : PossibilityTransportCargo, PossibilityTransportHuman {

}

class PassengerCar(override val maxQuantityCargo: Int = 0, override val maxQuantityHuman: Int = 3) : Vehicle(),
    PossibilityLoad {
    override fun loadInCar() {
        println("Я могу в салон посадить $maxQuantityHuman человек")
    }

    override fun unloadCar() {
        println("Я на остановке могу высадить $maxQuantityHuman человек")
    }
}

class CargoCar(override val maxQuantityCargo: Int = 2, override val maxQuantityHuman: Int = 1) : Vehicle(),
    PossibilityLoad {
    override fun loadInCar() {
        println("Я могу в кузов погрузить $maxQuantityCargo тонн груза и $maxQuantityHuman человек")
    }

    override fun unloadCar() {
        println("Я из кузова могу высыпать $maxQuantityCargo тонн песка")
    }
}

interface PossibilityTransportHuman {
    val maxQuantityHuman: Int
}

interface PossibilityTransportCargo {
    val maxQuantityCargo: Int
}

interface PossibilityLoad {
    fun loadInCar()
    fun unloadCar()
}

