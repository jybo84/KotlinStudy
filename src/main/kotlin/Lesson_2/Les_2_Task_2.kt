package Lesson_2

/*
В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии,
который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо
вывестив виде целых чисел.
 */

fun main(){
    val employee = 50
    val sumEmployee = 30000
    val intern = 30
    val sumIntern = 20000

    var totalSumEmployee = employee * sumEmployee
    println(totalSumEmployee)
    var totalsum = totalSumEmployee + (intern * sumIntern)
    println(totalsum)
    var sumOnOneEmployee = totalSumEmployee / (employee + intern)
    println(sumOnOneEmployee)


}