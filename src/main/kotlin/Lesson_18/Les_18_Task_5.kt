package Lesson_18

/*
Задача 5* к Уроку 18

В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).
 */

fun main() {
    var screen = Screen()
    screen.draw(point = Point(), 2)
    screen.draw(square = Square(), 2, 2)
    screen.draw(ring = Ring(), 3F, 3F)

}

open class Screen() {
    fun draw(point: Point, x: Int) {
        println("поставлена точка в месте $x")
    }

    fun draw(square: Square, x: Int, y: Int) {
        println("нарисован квадрат в месте $x $y")
    }

    fun draw(ring: Ring, x: Float, y: Float) {
        println("нарисован круг в месте $x $y")
    }
}

class Square() : Screen()

class Point() : Screen()

class Ring() : Screen()
