package Lesson_12

/*
Задача 2 к Уроку 12

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
- перепиши его, используя определение свойств в основном конструкторе;
- свойства не должны содержать значения по умолчанию (мы создаем каркас сущности для будущих объектов).
Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.
 */

fun main() {
    val wednesday = Forecast2(dayTemp = 15, nightTemp = 8, fallout = "Дождь", dayOfWeek = "среда")
    wednesday.printInfo()
}

class Forecast2(val dayTemp: Int, val nightTemp: Int, var fallout: String, var dayOfWeek: String) {
    fun printInfo(){
        println("В $dayOfWeek днем ${dayTemp}, ночью ${nightTemp}, осадки ${fallout}")
    }
}