package Lesson_2

import kotlin.math.min

/*
Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути
457 минут.
 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

fun main() {
    val hourStart = 9
    val minStart = 39
    val timeOfWay = 457

    val hourEnd = timeOfWay / 60
    val minEnd = timeOfWay % 60
    var totalHour = hourStart + hourEnd
    var totalMin = minStart + minEnd

    if (totalMin > 59) {
        totalMin = (totalMin % 60)
        totalHour++
    }
    println("Поезд прибудет на станцию в $totalHour:$totalMin")
}