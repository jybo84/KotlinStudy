package Lesson_3

/*
Задача 5* к Уроку 3

Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.
Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда
и номер хода, присвоить соответствующим переменным и распечатать по отдельности.
 */
fun main() {
    val receiveData = "D2-D4;0"

    // Вариант 1 (subString)

    println("Вариант 1 (subString)")

    val moveFrom = receiveData.substringBefore('-')
    println(moveFrom)

    val moveTo = receiveData.substring(3, 5)
    println(moveTo)

    val moveNumber = receiveData.substringAfter(';')
    println(moveNumber)

    // Вариант 2 (split)
    println()
    println("Вариант 2 (split)")

    val s1 = receiveData.split("-", ";") // разбиваем строку на строки

    val moveFromUseSplit = s1.get(0)  // присваиваем каждому элементу соответсвующее значение (метод get()  )
    println(moveFromUseSplit)         // выводим на печать

    val moveToUseSplit = s1[1]  // присваиваем каждому элементу соответсвующее значение (метод array[]   )
    println(moveToUseSplit)

    val moveNumberUseSplit = s1.get(2)
    println(moveNumberUseSplit)
}