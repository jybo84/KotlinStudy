package Lesson_15

/*
Задача 1 к Уроку 15

В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.
 */

fun main() {
    val crucianCarp = Fish()
    crucianCarp.swim()
    println()

    val seagull = Bird()
    seagull.fly()
    println()

    val duck = Duck()
    duck.fly()
    duck.swim()
}

class Fish() : Swimable {
    override fun swim() {
        println("Я плаваю под водой")
    }
}

class Bird() : Flyable {
    override fun fly() {
        println("Я летаю далеко и высоко")
    }
}

class Duck() : Flyable, Swimable {
    override fun swim() {
        println("Я могу сесть на воду и долго плавать по воде")
    }

    override fun fly() {
        println("Я летаю в районе водоемов и за мной охотятся охотники")
    }
}

interface Swimable {
    fun swim()
}

interface Flyable {
    fun fly()
}