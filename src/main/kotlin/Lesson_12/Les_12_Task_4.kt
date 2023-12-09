package Lesson_12

/*
Задача 4 к Уроку 12

Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.
 */

val TEMP_KELVIN = 273
fun main() {
    val toDay = Forecast()
}

class Forecast() {
    var dayTemp = 283
    var nightTemp = 273
    var fallout = "Дождь"

    init {
        dayTemp -= TEMP_KELVIN
        nightTemp -= TEMP_KELVIN
        println("Сегодня днем ${dayTemp}, ночью ${nightTemp}, осадки ${fallout}")
    }
}