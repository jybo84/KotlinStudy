package Lesson_12

/*
Задача 5* к Уроку 12

Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур и считать количество
дней с осадками за месяц.
Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.
- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса, передав в конструкторы случайные
значения;
- сохрани в отдельные списки дневные и ночные температуры, а также список дней с осадками;
- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции из стандартной
библиотеки;
- посчитай количество дней с осадками.

Выведи результаты в консоль.
 */

fun main() {
    val list = (1..30).map { ArchiveWeather() }
    list.forEachIndexed { i, el -> println("${i + 1} день: $el") }

    val listDayTemp = dayTemp(list)
    println("Список дневных температур: " + listDayTemp.joinToString(", "))

    val listNightTemp = nightTemp(list)
    println("Список ночных температур: " + listNightTemp.joinToString(", "))

    val listFalloutDay = falloutDay(list)
    println("Список дней с осадками: " + listFalloutDay.joinToString(", "))

    println("Средняя температура ночью = ${averageNightTemp(listNightTemp)}")

    println("Средняя температура днем = ${averageDayTemp(listDayTemp)}")

    println("количество дней с осадками ${countFalloutDay(listFalloutDay)}")
}

data class ArchiveWeather(
    val dayTemp: Int = (-10..25).random(),
    val nightTemp: Int = (-25..10).random(),
    val fallout: String = listOf("нет осадков", "дождь").random()
) {
    override fun toString(): String {
        return "  дневная температура: $dayTemp, ночная температура: $nightTemp, осадки:$fallout"
    }
}

fun dayTemp(list: List<ArchiveWeather>): List<Int> {
    val newList = mutableListOf<Int>()
    list.forEach { el ->
        newList.add(el.dayTemp)
    }
    return newList
}

fun nightTemp(list: List<ArchiveWeather>): List<Int> {
    val newList = mutableListOf<Int>()
    list.forEach { el ->
        newList.add(el.nightTemp)
    }
    return newList
}

fun falloutDay(list: List<ArchiveWeather>): List<String> {
    val newList = mutableListOf<String>()
    list.forEach { el ->
        if (el.fallout == "дождь")
            newList.add(el.fallout)
    }
    return newList
}

fun countFalloutDay(list: List<String>): Int {
    return list.size
}

fun averageNightTemp(list: List<Int>): Double {
    return list.average()
}

fun averageDayTemp(list: List<Int>): Double {
    return list.average()
}








