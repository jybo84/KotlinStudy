package Lesson_21

/*
Задача 3 к Уроку 21

Создай класс игрока, который аналогичен классу Player из задания 20-2. Помимо имени у игрока должны быть поля
с текущим и максимальным здоровьем. Предположим, что у нас нет возможности редактировать класс
(нельзя добавлять новые функции в класс Player).

Требуется реализовать функцию-расширение isHealthy для этого класса, которая будет возвращать true, если здоровье
игрока равно максимальному здоровью, и false в противном случае.
 */

fun main() {

    val person = Person("Max", 50, 100)
    println(person.isHealthy())
}

data class Person(val name: String, val currentHealth: Int, val maxHealth: Int) {

}

fun Person.isHealthy(): Boolean {
    return if (currentHealth == maxHealth) true
    else false
}