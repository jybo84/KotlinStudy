package Lesson_17

/*

Задача 4 к Уроку 17

Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
Опиши класс посылки с такими вводными:
- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.
Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика.
При реализации использовать сеттер.
 */


fun main() {

    val pac = Package()
    pac.place = "Хабаровск"
    println(pac)
    pac.place = "Владивосток"
    println(pac)
    pac.place = "Владивосток"
    println(pac)
    pac.place = "Москва"
    println(pac)
}

class Package(var count: Int = 0) {

    private val numOrder = 123

    var place: String = "Передано на почту"
        set(value) {
            if (value != field) {
                count++
                field = value
            } else
                field = "ТАМ ЖЕ"
        }

    override fun toString(): String {
        return "Посылка $numOrder находится в $place. Это $count пересылочная база"
    }
}