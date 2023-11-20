package Lesson_4

/*
Задача 2 к Уроку 4

При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу,
которая проверяет, соответствует ли груз категории "Average". Эта категория имеет следующие параметры:
вес от 35 кг до 100 кг (включительно), и объем меньше 100 литров.
Создай программу, которая отображает соответствие данных груза категории "Average". Вывод программы может
выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".
- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.
 */

const val MIN_WEGHT = 35
const val MAX_WEGHT = 100
const val VOLUM_LITER = 100

fun main() {

    val firstCargoWeght = 20
    val secondCargoWeght = 50
    val secondCargoLiter = 80
    val thirdCargoLiter = 100

    val res = (firstCargoWeght >= MIN_WEGHT) && (firstCargoWeght <= MAX_WEGHT)

    val res2 = (secondCargoWeght >= MIN_WEGHT) && (secondCargoWeght <= MAX_WEGHT) && (secondCargoLiter < VOLUM_LITER)

    val res3 = thirdCargoLiter < VOLUM_LITER

    println("Груз с весом $firstCargoWeght кг  соответствует категории 'Average': $res")
    println("Груз с весом $secondCargoWeght кг и объемом $secondCargoLiter л соответствует категории 'Average':  $res2")
    println("Груз с объемом $thirdCargoLiter соответствует категории 'Average':  $res3")

}