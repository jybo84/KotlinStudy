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

    val ring1 = Ring(5)
    println( ring1.square())

    val ring2 = Ring(10)
    println( ring2.square())

    val ring3 = Ring(15)
    println( ring3.square())

    val list = listOf(ring1, ring2, ring3)
    sumSquare(list)

        }



 open class Figure(){

     open fun square(): Double{
         return 3.14
     }
}

class Ring(private val radius: Int): Figure() {
    override fun square(): Double {
        return (3.14 * (radius * radius))

    }
}


    fun sumSquare(list: List<Figure>) {
        val listTot = list.map { it.square() }
        println(listTot)

        }




















/*const val PI = 3.14
fun main() {

    val ring1 = Ring("белый", 10F)
    println( ring1.color)
    ring1.getSquare()
    ring1.getPerimeter()
    println()

    val ring2 = Ring("чёрный", 15F)
    println( ring2.color)
    ring2.getSquare()
    ring2.getPerimeter()
    println()

    val ring3 = Ring("чёрный", 20F)
    println( ring3.color)
    ring3.getSquare()
    ring3.getPerimeter()
    println()


    val list = listOf(ring1, ring2, ring3)


}

abstract class Figure(val color: String){

    abstract fun getSquare()
    abstract fun getPerimeter()
}

class Ring(color: String, val radius: Float): Figure(color){

    override fun getSquare() {
        println((PI * (radius * radius)).toFloat())
    }

    override fun getPerimeter() {
        println((2 * PI * radius).toFloat())
    }
}*/