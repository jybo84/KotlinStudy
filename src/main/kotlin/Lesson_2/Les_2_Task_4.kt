package Lesson_2

import kotlin.time.times

/*
Задача 4 к Уроку 2

В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса), который дает +20%
к добытым материалам. Было добыто 7 кристаллической и 11 железной руды без баффа – заранее известные данные,
объявить и проинициализировать.
Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных”
(то есть тех материалов, которые даются “сверху” баффом). По одной строке на материал с его названием.
Если получается нецелое число, то дробная часть должна отбрасываться.
 */

fun main(){
    val crystal = "Кристал"
    val iron = "Железная руда"
    val num1 = 7
    val num2 = 11
    //val bonus = 0.2
    val bonus = 20 / 100F

    val crystalBonus = (num1 * bonus).toInt()
    println("Вы получили $crystalBonus  бонусный $crystal")

    val ironBonus = (num2 * bonus).toInt()
    println("Вы получили $ironBonus единиц  $iron ")

}