package Lesson_20

/*
Задача 3 к Уроку 20

В игре есть запертая дверь. Игрок должен найти ключ. Нужно написать лямбда-функцию, которая будет проверять,
есть ли у игрока ключ. Если ключ есть, нужно вывести сообщение, что игрок дверь открыл, иначе – что дверь заперта.
Для проверки работы функции нужно написать класс игрока, в котором будет храниться информация о наличии ключа.
 */

fun main() {

    val heroesMax = Heroes("Max", false)

    val heroesDenis = Heroes("Денис", true)

    val getInformationAboutKey =
        { heroes: Heroes -> if (heroes.isHaveKey) println("Персонаж ${heroes.name} открыл  дверь") else println("Дверь заперта") }

    getInformationAboutKey(heroesMax)
    getInformationAboutKey(heroesDenis)
}

class Heroes(val name: String, val isHaveKey: Boolean)