package Lesson_18
/*
Задача 4 к Уроку 18

В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки. Чтобы рассчитывать
упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.
Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой. Если посылка – куб,
то только с длиной ребра.
 */

fun main() {

    val package1 = PackageRectangle(2, 3, 4)
    println(package1.squareOfPackage())
    println()

    val package2 = PackageCube(3)
    println(package2.squareOfPackage())
}

abstract class Package() {
    abstract fun squareOfPackage(): Int
}

class PackageRectangle(val length: Int, val width: Int, val height: Int) : Package() {

    override fun squareOfPackage(): Int {
        return length * width * height
    }
}

class PackageCube(val edgeLength: Int) : Package() {

    override fun squareOfPackage(): Int {
        return 6 * (edgeLength * edgeLength)
    }
}
