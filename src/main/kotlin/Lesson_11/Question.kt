package Lesson_11


fun main() {
    val first = First()
    println(first)
    println()

    val second = Second("")
}

data class First( val userId: Int = (0..100).random()) //TODO здесь нормально


data class Second(val userId: Int = (0..100).random(), val name: String) // TODO здесь не хочет



// UUID.randomUUID().toString(),