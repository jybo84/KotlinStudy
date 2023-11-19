package Lesson_1

/*
В любом учебнике есть задачи про космос. Объяви переменные и выведи данные о полете в космос первого
человека.
 – Запиши в новую переменную year год полета Юрия Гагарина в космос;
 – Объяви и проинициализируй переменные hour и minute – час и минуту взлета соответственно;
 – Выведи год, час и минуту взлета по одной переменной на каждую строку;
 – Затем измени значения переменных hour и minute, чтобы они теперь имели значение часа и минуты посадки;
 – Выведи время посадки в одной строке в формате [часы:минуты]. Пример: 10:55.
Определи, где в программе переменные должны задаваться через val, а где через var.
    Данные для задачи:
    Год полета – 1961
    Взлет – 09:07
    Посадка – 10:55
    */

fun main(){
    val yearOfFlight = 1961
    var hour = 9
    var min = 7

    println(yearOfFlight)
    println()

    val newHour = "%02d".format(hour) // задаем формат часов
    println(newHour)

    val newMin = "%02d".format(min) // задаем формат минут
    println(newMin)

    println()

    hour = 10
    min = 55
    println( "%02d:%02d".format(hour, min)) // сразу задаем фомат и выводим данные
}