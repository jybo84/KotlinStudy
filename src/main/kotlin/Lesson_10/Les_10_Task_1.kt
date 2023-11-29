package Lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

/*
Задача 1 к Уроку 10

Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости. Побеждает выбросивший наибольшее
число.
- поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
- бросок кости вынеси в отдельную функцию, в которой генерируется случайное число от 1 до 6;
- в отдельные переменные сохрани результат работы функции для игрока и компьютера;
- после сравнения результатов, выведи соответствующее сообщение в консоль. Например: "Победило человечество"
или "Победила машина".
 */
fun main() {
    println("Бросок человека")
 val humanNum =  getRandomNum()
    println(humanNum)

    println("Бросок компьютера")
    val  compNum = getRandomNum()
    println(compNum)

    val res = if(humanNum > compNum)"Победило человечество" else "Победила машина"
    println(res)
}

fun getRandomNum(): Int =  Random.nextInt(1..6)

