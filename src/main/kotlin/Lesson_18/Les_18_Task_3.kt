package Lesson_18

/*
Задача 3 к Уроку 18

В тамагочи есть лиса, собака и кошка. Они могут играть, спать и есть. Лиса ест ягоды, собака – кости, а кошка – рыбу.
У каждого животного есть имя. Эти действия отображаются в консоли по такому шаблону: “[имя] - [действие]”.
Опиши эти классы, используя полиморфизм и создай по одному экземпляру.
 */

fun main() {

    val fox = Fox()
    fox.eat("ягоды", "Алиса")
    println()

    val dog = Dog()
    fox.eat("кости", "Шарик")
    println()

    val cat = Cat()
    cat.eat("рыбу", "Барсик")



}

abstract class Animal() {


    open fun eat(food: String, name: String){
        println("Я $name - ем")
    }

     fun play(){
         println("Я играю")
     }

     fun sleep(){
      println("Я сплю")
    }
}

class Fox(): Animal() {

    override fun eat(food: String, name: String){
        println("Я $name - ем $food")
    }
}

class Dog(): Animal() {

      override fun eat(food: String, name: String){
        println("Я $name - ем $food")
    }
}

class Cat(): Animal() {

    override fun eat(food: String, name: String){
        println("Я $name - ем $food")
    }
}