package Lesson_1

/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые
переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */
// 108 минут
fun main(){

    val totalTimeSec = 6480
    var totalTimeHour = 6480 / 60
    var totalTimeMin = totalTimeHour / 60
    var remainTotalHour =  totalTimeHour % 60
    var remainTotalMin = totalTimeMin % 60

    val hour = 1
    val min = 48
    val zero = 0


    println(totalTimeHour)
    println(totalTimeMin)
    println(remainTotalHour)
    println(remainTotalMin)
    println()
    println("Ю.Гагарин облетел земной шар за $zero$hour:$min:$zero$zero")
}