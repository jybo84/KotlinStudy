package Lesson_4

/*
Задача 3 к Уроку 4

На территории агрокомплекса функционирует система автоматического мониторинга условий для роста растений.
Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.
Критерии благоприятных условий включают:
- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.
Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для роста бобовых?.
 true/false”

Для проверки работы программы, инициализируй переменные следующими значениями:
- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.
И типами данных - boolean, boolean, int, String.
 */

const val IS_WEATHER_SUNNY = true
const val IS_TENT_OPEN = true
const val WET = 20
const val BAD_SEASON = "winter"
fun main() {
    val weatherToDaySunny = true
    val tentToDayOpen = true
    val wetToDay = 20
    val seasonToDay = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых?. ${if (weatherToDaySunny == IS_WEATHER_SUNNY
            && tentToDayOpen == IS_TENT_OPEN && wetToDay == WET && seasonToDay != BAD_SEASON) true else false}")

}