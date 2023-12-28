package Lesson_20

/*
Задача 1 к Уроку 20

В приложении есть SplashScreen, который приветствует пользователя, обращаясь по имени.
Напиши лямбда-функцию с явным указанием типа при ее объявлении, которая будет создавать строку с текстом
«С наступающим Новым Годом, username!», где username – это имя пользователя. Выведи строку в консоль.
 */

fun main() {
    val lamda = { name: String -> "С наступающим новым годом $name" }
    val text = lamda("Максим")
    println(text)

    val lamda2 = { username: String -> println("И тебя с Праздником $username") }
    val greeting = lamda2("Иван")
}