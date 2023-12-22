package Lesson_17

/*
Задача 3 к Уроку 17

В приложении для хранения облачных файлов есть папки и файлы.
Создай класс папки, который имеет имя, количество файлов и флаг “секретно”. Если флаг имеет значение true, то при
попытке прочитать имя, возвращать строку “скрытая папка” и количество файлов – 0. В ином случае возвращать ее название
и реальное количество файлов. Для реализации должны использоваться геттеры.
Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.
 */
fun main() {
    val folder = Folder()
    folder.name = "java"
    folder.quantityFile = 50
    folder.isSecret = false
    println(folder)

    val folder1 = Folder()
    folder1.name = "Kotlin"
    folder1.quantityFile = 100
    folder1.isSecret = true
    println(folder1)
}

class Folder() {
    var isSecret: Boolean = false

    var name: String = ""
        get() = if (!isSecret) field else "секретная"

    var quantityFile: Int = 0
        get() = if (!isSecret)  field else 0

    override fun toString(): String {
        return "Папка $name, количество файлов $quantityFile"
    }
}
