package Lesson_3

/*
Задача 5* к Уроку 3

Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.
Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда
и номер хода, присвоить соответствующим переменным и распечатать по отдельности.
 */
fun main(){
    val receiveData = "D2-D4;0"

    val moveFrom = receiveData.substringBefore('-')
    println(moveFrom)

    val moveTo = receiveData.substring(3, 6)
    println(moveTo)

    val moveNumber = receiveData.substringAfter(';')
    println(moveNumber)

}