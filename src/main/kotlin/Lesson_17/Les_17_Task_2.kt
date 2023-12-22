package Lesson_17

/*
Задача 2 к Уроку 17

Опиши класс для корабля в мобильной игре. Поля хранят имя, среднюю скорость и порт приписки.
Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.
Создай экземпляр класса и протестируй работу.
 */

fun main() {
    val boat = Boat()
    println(boat)
    boat.name = "Другое имя"
    println(boat)
    boat.name = "Еще какое то название"
    println(boat)
    boat.name = "Неудержимый"
    println(boat)
}

class Boat() {
    var name = "Чёрная жемчужина"
        set(value) {
            println("ВНИМАНИЕ (плохая примета менять имя)")
            field = value
        }

    val speed = 100
    val port = "Владивосток"
    override fun toString(): String {
        return "Корабль с именем $name скорость $speed узлов и портом приписки $port"
    }
}