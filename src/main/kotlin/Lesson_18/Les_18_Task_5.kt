package Lesson_18

/*
Задача 5* к Уроку 18

В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).
 */

fun main() {

    val ring = Ring()
    ring.draw(4, 3)
    println()

    val point = Point()
    point.draw(5)
    println()

    val square = Square()
    square.draw(2F, 3F)
    println()
}

abstract class Screen() {
    fun draw(x: Int) {
        println("поставлена точка в месте $x")
    }

    fun draw(x: Int, y: Int) {
        println("нарисован квадрат в месте $x $y")
    }

    fun draw(x: Float, y: Float) {
        println("нарисован круг в месте $x $y")
    }
}

class Square() : Screen()

class Point() : Screen()

class Ring() : Screen()
