package Lesson_16

/*
Задача 2 к Уроку 16

Создай класс, описывающий круг. У него должны быть методы, вычисляющие длину окружности и площадь круга, используя
радиус.
Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне. Радиус передается
через конструктор и не виден из внешнего по отношению к классу кода.
Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.
 (Длина окружности 2Пr,  площадь Пrr)
 */

private const val PI = 3.14F
fun main() {
    val ring = Circle(10)
    println(ring.getSquare())
    println(ring.longOfCircle())
}

class Circle(private val radius: Int) {
    fun getSquare(): Float {
        return PI * (radius * radius)
    }

    fun longOfCircle(): Float {
        return 2 * PI * radius
    }
}