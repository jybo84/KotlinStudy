package Lesson_2

import kotlin.math.pow

/*
Задача 5* к Уроку 2

Напиши программу-калькулятор для банковского приложения (такой функционал бывает на промо экранах).
Используя формулу сложных процентов (ее можно загуглить), нужно посчитать размер вклада через 20 лет с такими условиями:
 – Клиент ввел в приложении сумму 70_000 рублей (считать ее известной заранее и проинициализировать переменную);
 – Процентная ставка 16,7% (проценты начисляются в конце года);
 – Подсчитать размер вклада через 20 лет;
 – Результат должен быть дробным числом с 3 знаками после запятой;
 – Ответ должен получиться таким 1536438.428.
 */

fun main() {

    val compountInterestCalculator = CompountInterestCalculator(20, 16.7, 70_000)
    compountInterestCalculator.calculation()
}

class CompountInterestCalculator(val period: Int, val rent: Double, val amount: Int) {

    fun calculation() {
        val interestRate = rent / 100
        val capitalization = 1
        val res = amount * (capitalization + interestRate).pow(period)
        println("%.3f".format(res))
    }
}