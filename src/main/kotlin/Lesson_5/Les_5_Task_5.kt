package Lesson_5

/*
Задача 5* к Уроку 5

Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42. Пользователь вводит числа через
консоль.
Требования к программе:
- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
- Поочередно введенные пользователем числа должны также храниться в списке.
- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции в отдельную переменную.
В зависимости от количества угаданных чисел программа выводит результат:
- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
- Если угадано одно число, пользователю выплачивается утешительный приз.
- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
- В конце игры вне зависимости от результата программа выводит выигрышные числа.
 */

fun main() {

    println("Введите 3 числа в диапазоне от 0 до 42")
    var count = 0
    Thread.sleep(500)

    val userNum = (0..2).map {
        println("Введите ${++count}-e число")
        readln().toInt()
    }

    val compNum = (0..2).map { (0..42).random() }

    println("Ваши числа: ${userNum.joinToString(", ")}")
    println("Загаданные числа: ${compNum.joinToString(", ")}")

    val total = userNum.intersect(compNum)

    when (total.size) {
        3 -> println("Джекпот - угаданы все 3 числа")
        2 -> println("Крупный приз - угаданы 2 чмсла")
        1 -> println("Утешительный приз - угадано 1 число")
        else -> println("Попробуй еще раз, не угадано ни одного числа")
    }
}