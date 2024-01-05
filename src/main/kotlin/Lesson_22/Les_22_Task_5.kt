package Lesson_22

import java.time.LocalDateTime

/*
Задача 5* к Уроку 22

В Путеводитель для путешествующих автостопом по Галактике добавляется информация о месте или событии в галактике
в виде объектов.
Создай data class GalacticGuide cо свойствами:
- название места или события;
- описание места или события;
- дата и время события;
- расстояние места или события от Земли в световых годах.
Создай объект с информацией о звездной системе Alpha Centauri. Выведи информацию о месте, используя компонентные функции
 data class.
 */


fun main() {
    val alphaCentaura = GalacticGuide("Альфа-Центавра", "звезда", dateTime = LocalDateTime.now(), 5)

    println(alphaCentaura.component1())
    println(alphaCentaura.component2())
    println(alphaCentaura.component3())
    println("${alphaCentaura.component4()} световых лет")

}

data class GalacticGuide(
    val place: String,
    val descriptionPlace: String,
    var dateTime: LocalDateTime,
    val distance: Int,
)