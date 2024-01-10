package Lesson_15


/*
Задача 2 к Уроку 15

Необходимо разработать простую систему мониторинга погодных условий, которая будет собирать данные о температуре
и количестве осадков.
Создай абстрактный класс WeatherStationStats. Он будет служить родителем для классов-объектов погодных данных:
Temperature и PrecipitationAmount.

Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer. Метод отправки сообщения должен
определять тип переданного сообщения и в зависимости от результата передавать соответствующие данные.

Создай по одному объекту для разных типов погодных данных и протестируй работу программы.
 */

fun main() {

    val weatherServer = WeatherServer()
    weatherServer.sendMassageOnServer(2.0)
    weatherServer.sendMassageOnServer(5)
}

abstract class WeatherStationStats()

open class Temperature(private val temp: Int) : WeatherStationStats()


open class PrecipitationAmount(private val amount: Double) : WeatherStationStats()

class WeatherServer() {
    fun sendMassageOnServer(weatherStationStats: WeatherStationStats) {
        when (weatherStationStats) {
            is Temperature -> println("Данные о температуре: $temp")
            is PrecipitationAmount -> println("Данные о количестве осадков: $amount")

        }

    }

}

