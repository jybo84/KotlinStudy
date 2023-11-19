package Lesson_3

/*
Задача 1 к Уроку 3

При входе в приложение высвечивается приветствие. Представим, что мы пишем функцию, которая будет выводить
приветствие с именем пользователя на экран (в нашем случае в консоль). Tекст приветствия может меняться в
зависимости от времени суток. Так, например, выводится приветствие при входе в приложение Сбербанка.

Приветствие и имя пользователя должны храниться в отдельных переменных. Вывести в консоль два приветствия
(для дня и для вечера), перезаписывая данные в одну исходную переменную.
 */

fun main(){
    val greetingDay = "Добрый день"
    val greetingEvening = "Добрый вечер"
    val greetingMorning = "Доброе утро"
    val greetingNight = "Доброй ночи"

    println("Введите который сейчас час")
    var hour: Int = Integer.valueOf(readln())
    println("Введите имя ")
    var name = readLine()

    if (hour != null) {
        if(hour >= 11 && hour <= 16)
            println("$greetingDay $name")
        else if(hour >= 17 && hour <= 23)
            println("$greetingEvening $name")
        else if(hour > 0 && hour <= 3)
            println("$greetingNight $name")
        else if(hour >= 4 && hour <= 10)
            println("$greetingMorning $name")
        else
            println("Значение часа суток может быть только с 0 д до 23")
        return

    }


}