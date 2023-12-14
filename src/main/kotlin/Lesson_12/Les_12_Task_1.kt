package Lesson_12

/*
Задача 1 к Уроку 12

Программа отслеживает погоду по дням. Создай класс для хранения данных о температуре и осадках для одного дня.
Объекты класса будут хранить:
- дневная температура;
- ночная температура;
- наличие осадков в течение суток.
Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.
- в классе создай переменные и проинициализируй их какими-нибудь значениями;
- затем в созданных объектах подставь другие значения этим переменным.
В этой задаче используй пустой конструктор.
 */

fun main() {
    val monday = Weather()
    monday.printInfo()

    val tuesday = Weather()
    tuesday.dayOfWeek = "вторник"
    tuesday.dayTemp = 5
    tuesday.nightTemp = 0
    tuesday.fallout = "ожидаются"

    tuesday.printInfo()
}

class Weather() {
    var dayOfWeek = "понедельник"
    var dayTemp = -10
    var nightTemp = -20
    var fallout = "не ожидаются"

    fun printInfo() {
        println("В $dayOfWeek днём $dayTemp $dayOfWeek ночью $nightTemp осадки $fallout")
    }
}
