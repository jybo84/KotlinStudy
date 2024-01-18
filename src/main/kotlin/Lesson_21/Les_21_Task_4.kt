package Lesson_21

import java.io.File

/*
Задача 4 к Уроку 21

В курсовой работе мы разрабатываем телеграм-бота на Kotlin, который помогает пользователям учить иностранные слова.
Создай extension функцию для класса File из стандартной библиотеки, которая будет записывать переданное ей слово в файл.
- дополнительные материалы про файлы есть в 1-2 этапах курсовой;
- функция-расширение должна записывать текст в нижнем регистре;
- функция-расширение должна записывать текст в начало файла.
 */

fun main() {

    val first = File("word.txt")
    first.createNewFile()
    first.writeText("язык для программирования Андроид ")

    println(first.readText())

    first.appendStartLowercase("КОТЛИН - ")
}
fun File.appendStartLowercase(text: String) {
    this.writeText((text + this.readText()).lowercase())
    println((text + this.readText()).lowercase())
}