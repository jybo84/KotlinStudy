package Lesson_14

/*
Задача 3 к Уроку 14

Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником. Каждая фигура имеет свой цвет
и уникальные параметры:
- для круга — радиус;
- для прямоугольника — ширину и высоту.
Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:
- для вычисления площади;
- для вычисления периметра.
Добавь классы-наследники для вышеупомянутых типов фигур. Реализуй методы для вычисления площади и периметра в каждом
из классов-наследников (формулы можно найти в интернете).
Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:
- сумму периметров всех черных фигур;
- сумму площадей всех белых фигур.
 */

fun main() {

    val ring1 = Ring(Color.WHITE.name, 5)
    println(ring1.square())

    val ring2 = Ring(Color.BLACK.name, 10)
    println(ring2.perimeter())

    val rectangle1 = Rectangle(Color.WHITE.name, 2, 1)
    println(rectangle1.square())

    val rectangle2 = Rectangle(Color.BLACK.name, 3, 1)
    println(rectangle2.perimeter())

    val list = listOf(ring1, ring2, rectangle1, rectangle2)
    println()
    sumPerimeterBlack(list)
    println()
    sumSquareWhite(list)
}


abstract class Figure(var color: String) {

    abstract fun square(): Float

    abstract fun perimeter(): Float
}

class Ring(color: String, private val radius: Int) : Figure(color) {
    override fun square(): Float {
        return (3.14 * (radius * radius)).toFloat()
    }

    override fun perimeter(): Float {
        return (2 * 3.14 * radius).toFloat()
    }
}

class Rectangle(color: String, private val sideOne: Int, private val sideTwo: Int) : Figure(color) {

    override fun square(): Float {
        return (sideOne + sideTwo).toFloat()
    }

    override fun perimeter(): Float {
        return (2 * (sideOne + sideTwo)).toFloat()
    }
}

fun sumSquareWhite(list: List<Figure>) {
    val newList = list.filter { it.color == Color.WHITE.name }.map { it.square() }.sum()
    println(newList)
}

fun sumPerimeterBlack(list: List<Figure>) {
    val newList = list.filter { it.color == Color.BLACK.name }.map { it.perimeter() }.sum()
    println(newList)
}

enum class Color( name: String){
    BLACK("Чёрный"),
    WHITE("Белый")
}