package Lesson_22

/*
Задача 3 к Уроку 22

Используя любой data class, в котором есть минимум 3 свойства, выполни деструктуризацию объекта на отдельные
переменные и выведи их значения в консоль.
 */

fun main() {

    val volga = Car("Волга", 100, "Черная")

   val (model, speed, color) = volga

    println(model)
    println(speed)
    println(color
    )
}

data class Car(val model: String, val speed: Int, val color: String)