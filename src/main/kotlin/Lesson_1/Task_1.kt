package Lesson_1

fun main(args: Array<String>){
    val totalOrder: Int = 75
    var sayThanks: String = "Мы очень благодарны, что Вы покупаете именно у нас"
    println("Вы совершили $totalOrder -ю покупку. $sayThanks")

    sayThanks = "У вас будут большие скидки"

    println("Если Вы совершите еще $totalOrder покупок, то $sayThanks")
}