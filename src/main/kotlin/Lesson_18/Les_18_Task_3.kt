package Lesson_18

/*
Задача 3 к Уроку 18

В тамагочи есть лиса, собака и кошка. Они могут играть, спать и есть. Лиса ест ягоды, собака – кости, а кошка – рыбу.
У каждого животного есть имя. Эти действия отображаются в консоли по такому шаблону: “[имя] - [действие]”.
Опиши эти классы, используя полиморфизм и создай по одному экземпляру.
 */

fun main() {

    val fox = Fox("Алиса", "Ягоды")
    fox.eat()
    println()

    val dog = Dog("Шарик", "Косточка")
    fox.eat()
    println()

    val cat = Cat("Барсик", "рыба")
    cat.eat()


}

abstract class Animal(val name: String, val food: String) {


    open fun eat() {
        println("Я $name - ем")
    }

    fun play() {
        println("Я играю")
    }

    fun sleep() {
        println("Я сплю")
    }
}

class Fox(name: String, food: String) : Animal(name, food) {

    override fun eat() {
        println("Я $name - ем $food")
    }
}

class Dog(name: String, food: String) : Animal(name, food) {

    override fun eat() {
        println("Я $name - ем $food")
    }
}

class Cat(name: String, food: String) : Animal(name, food) {

    override fun eat() {
        println("Я $name - ем $food")
    }
}