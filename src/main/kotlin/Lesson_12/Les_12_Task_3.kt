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

val TEMP_KELVIN1 = 273
fun main() {
    val thursday = Forecast3(283, 273, "ожидается дождь", "четверг")
    thursday.printInfo()
}

class Forecast3( _dayTempKelvin: Int, _nightTempKelvin: Int, _fallout: String, _dayOfWeek: String) {

    var dayTempKelvin: Int = _dayTempKelvin
    var nightTempKelvin: Int = _nightTempKelvin
    val fallout: String = _fallout
    val dayOfWeek: String = _dayOfWeek

    init {
        dayTempKelvin -= TEMP_KELVIN1
        nightTempKelvin -= TEMP_KELVIN1
    }

    fun printInfo() {
        println("В $dayOfWeek днем- $dayTempKelvin, ночью- $nightTempKelvin, осадки- ${fallout}")
    }
}