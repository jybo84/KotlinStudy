package Lesson_5

import kotlin.random.Random
import kotlin.random.nextInt

/*
Задача 3 к Уроку 5

Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42. Если угадать только одно –
игрок получает утешительный приз. Напиши программу, проверяющую выигрыш. Пользователь должен вводить числа в консоль.
Правильные числа заранее известны и хранятся в переменных. Оформить ввод текстовыми подсказками о том, что нужно
вводить. Вывести отдельным сообщением, какие числа были нужны для победы.
- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
- если не угадано ничего, вывести “Неудача!”;
- программа должна учитывать ввод чисел в обратном порядке.
 */

fun main() {

    val randomNum1= Random.nextInt(0..42)
    val randomNum2= Random.nextInt(0..42)

    println("Угадайте первое число - ")
    val numUser1 = readln().toInt()
    println("Угадайте второе число - ")
    val numUser2 = readln().toInt()

    val checkUserNum1randomNum = if(numUser1 == randomNum1 || numUser1 == randomNum2) true else false
    val checkUserNum2randomNum = if(numUser2 == randomNum1 || numUser2 == randomNum2) true else false

    if(checkUserNum1randomNum == true && checkUserNum2randomNum == true) println("Вы выиграли главный приз")
    else if(checkUserNum1randomNum == false && checkUserNum2randomNum == false) println("Неудача\nПопробуй еще раз")
    else println("Вы выиграли утешительный приз")
    println("Случайные числа были = $randomNum1 и $randomNum2")
    }

