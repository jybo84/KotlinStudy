package Lesson_18

/*
Задача 2 к Уроку 18

В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.
Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод, бросающий кость и печатающий з
начение в консоль.
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

abstract class Dice(private val edge: Int) {
    fun castDice() {
        val num = (1..edge).random()
        println("Выпала грань с цифрой $num")
    }
}

class DiceFourEdge(edge: Int = 4) : Dice(edge) {

}

class DiceSixEdge(edge: Int = 6) : Dice(edge) {

}

class DiceEightEdge(edge: Int = 8) : Dice(edge) {

}