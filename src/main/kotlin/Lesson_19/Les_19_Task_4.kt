package Lesson_19

/*
Задача 4 к Уроку 19

В компьютерной игре танк может подбирать разные виды патронов. Патроны различаются силой удара. Синие – 5 единиц,
зеленые – 10, красные – 20.
 – создай enum класс для патронов и класс танка. У танка должны быть методы вооружения новым типом патронов и выстрела.
 При выстреле в консоль должен выводиться нанесенный урон;
 – создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
– экземпляр танка при создании ничем не заряжен;
 – в решении должен использоваться enum.
 */


fun main() {
    val tank = Tank()
    tank.charge(Tank.Patron.RED)
    tank.shut(Tank.Patron.RED)
    tank.shut(Tank.Patron.GREEN)

}

class Tank(
    private var coutRed: Int = 0,
    private var countGreen: Int = 0,
    private var countBlue: Int = 0,
) {


    fun charge(patron: Patron) {
        when (patron) {
            Patron.BLUE -> {
                println("Заряжен Голубой паторон")
                countBlue++
            }

            Patron.GREEN -> {
                println("Заряжен Зеленый паторон")
                countGreen++
            }

            Patron.RED -> {
                println("Заряжен Красный паторон")
                coutRed++
            }
        }
    }

    fun shut(patron: Patron) {
        when (patron) {
            Patron.BLUE -> if (countBlue > 0) {
                println("Нанес ${Patron.BLUE.power} урона")
                countBlue--
            } else
                println("танк не заряжен данным патроном")

            Patron.GREEN -> if (countGreen > 0) {
                println("Нанес ${Patron.GREEN.power} урона")
                countGreen--
            } else
                println("танк не заряжен данным патроном")

            Patron.RED -> if (coutRed > 0) {
                println("Нанес ${Patron.RED.power} урона")
                coutRed--
            } else
                println("танк не заряжен данным патроном")
        }
    }

    enum class Patron(val power: Int) {
        BLUE(5),
        GREEN(10),
        RED(20),
    }
}