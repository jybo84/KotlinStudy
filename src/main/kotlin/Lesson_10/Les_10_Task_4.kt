package Lesson_10

/*
Задача 4 к Уроку 10

Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости. Побеждает выбросивший наибольшее число.
Теперь дай возможность пользователю играть до тех пор пока ему не надоест. В конце программа должна вывести сколько
партий он выиграл.
- после первого раунда программа задает вопрос: “Хотите бросить кости еще раз? Введите Да или Нет”;
- программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества выигрышных
партий человека;
- в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков);
- основная логика программы должна находиться в main(), а 2 другие функции будут вспомогательными.
 */

fun main() {
    var countHum = 0
    var countComp = 0
    var draw = 0

    println("Игра началась")
    Thread.sleep(1000)

    while (true) {
        println("Бросок человека")
        Thread.sleep(1000)
        val first = moveHuman()
        println(first)
        Thread.sleep(1000)

        println("Бросок компьютера")
        Thread.sleep(1000)
        val second = moveComp()
        println(second)

        if (first > second) {
            println("Победило человечество")
            countHum++
        } else if (first < second) {
            println("Победила машина")
            countComp++
        } else {
            println("ничья")
            draw++
        }
        println("Хотите сыграть еще?  ДА или НЕТ")

        if (readln().equals("нет")) {
            break
        }
    }
    println("Игра закончена счет:  человечество $countHum : $countComp машины     ничьих $draw")
}

fun getRandomNumber(): Int = (1..6).random()
fun moveHuman(): Int {
    return getRandomNumber()
}

fun moveComp(): Int {
    return getRandomNumber()
}






