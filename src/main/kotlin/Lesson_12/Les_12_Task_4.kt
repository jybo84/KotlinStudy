package Lesson_12

/*
Задача 4 к Уроку 12

Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.
 */

val TEMP_KELVIN = 273
fun main() {
    val friday = Forecast(283, 273, "не ожидаются", "пятница")
}

class Forecast(var dayTempKelvin: Int, var nightTempKelvin: Int, var fallout: String, var dayOfWeek: String) {

    fun printInfo() {
        println("В $dayOfWeek днем $dayTempKelvin, ночью $nightTempKelvin, осадки $fallout")
    }

    init {
        dayTempKelvin -= TEMP_KELVIN
        nightTempKelvin -= TEMP_KELVIN
        printInfo()

    }
}