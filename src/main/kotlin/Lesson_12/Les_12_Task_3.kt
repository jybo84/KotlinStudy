package Lesson_12

/*
Задача 3 к Уроку 12

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
- в этой задаче используй первичный конструктор без выделения памяти под свойства;
- поля должны быть объявлены и проинициализированы в теле класса;
- все поля с температурой должны иметь тип Int;
- программа не должна иметь других функций, кроме метода вывода информации о погоде.
В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.
Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.
 */

val TEMP_KELVIN = 273
fun main() {
    val thursday = Forecast(283, 273, "ожидается дождь", "четверг")
    thursday.printInfo()
}

class Forecast(dayTempKelvin: Int, nightTempKelvin: Int, fallout: String, dayOfWeek: String) {

    var dayTempKelvin: Int = 283
    var nightTempKelvin: Int = 273
    val fallout: String = "ожидается дождь"
    val dayOfWeek: String = "четверг"

    init {
        this.dayTempKelvin -= TEMP_KELVIN
        this.nightTempKelvin -= TEMP_KELVIN
    }

    fun printInfo() {
        println("В $dayOfWeek днем- $dayTempKelvin, ночью- $nightTempKelvin, осадки- ${fallout}")
    }
}