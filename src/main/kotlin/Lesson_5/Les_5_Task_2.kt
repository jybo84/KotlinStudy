package Lesson_5

/*Задача 2 к Уроку 5

Изменить пример из видео урока. В уроке создавался блок кода, считывающий возраст. И если возраст больше или равен
18 лет, показывали экран с ограниченным контентом (выводили это сообщение в консоль в качестве имитации).

Новое условие:
– Пользователь должен вводить не возраст, а год рождения;
– Возраст пользователя высчитывать на основании текущего года;
– Вычисляемый результат должен сравниваться с константой, в которой хранится возраст совершеннолетия (18);
– Если год рождения подходит, выводить сообщение “Показать экран со скрытым контентом”.
 */

const val YEAR_NOW = 2023

const val LIMIT = 18
fun main(){
    println("""
        Приветсвуем Вас на нашем портале
        Введите год Вашего рождения
    """.trimIndent().uppercase())

    val yearBorn = readln().toInt()
    var res = if((YEAR_NOW - yearBorn) >= LIMIT)"Доступ разрешен" else "Доступ запрещен"
    println(res)

}