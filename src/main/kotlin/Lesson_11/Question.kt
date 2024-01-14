package Lesson_11


fun main() {
    val first = First()
    println(first)
    println()

    val second = Second("Макс")
    println(second)
}

data class First( val userId: Int = (0..100).random()) //TODO здесь нормально


data class Second(val name: String, val userId: Int = (0..100).random()) // TODO здесь не хочет



// UUID.randomUUID().toString(),