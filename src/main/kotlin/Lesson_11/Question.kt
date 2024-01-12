package Lesson_11


fun main() {
    val first = First()
    println(first)
    println()

    val second = Second("")
}

data class First( val userId: Int = (0..100).random())


data class Second(val userId: Int = (0..100).random(), val name: String)



// UUID.randomUUID().toString(),