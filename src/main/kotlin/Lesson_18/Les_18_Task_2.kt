package Lesson_18

/*
Задача 2 к Уроку 18

В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.
Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод, бросающий кость и печатающий
значение в консоль.
Для демонстрации полиморфизма “включения”:
- создай несколько объектов с разными гранями;
- собери из них список объектов, указав тип списка;
- выполни итерацию по списку и вызови у каждого объекта метод броска кости.
 */

fun main() {
    val dice1 = DiceFourEdge()
    val dice2 = DiceSixEdge()
    val dice3 = DiceEightEdge()
    val listDice = listOf(dice1, dice2, dice3)
    listDice.forEach { el -> el.castDice() }
}

abstract class Dice() {
    open val edge: Int = 6
    fun castDice() {
        val num = (1..edge).random()
        println("Выпала грань с цифрой $num")
    }
}

class DiceFourEdge() : Dice() {
    override val edge: Int = 4
}

class DiceSixEdge() : Dice() {

}

class DiceEightEdge() : Dice() {
    override var edge: Int = 8
}