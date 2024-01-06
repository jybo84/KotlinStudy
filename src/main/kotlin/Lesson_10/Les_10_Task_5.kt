package Lesson_10

/*
Задача 5* к Уроку 10

Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.
Метод авторизации принимает логин и пароль, верифицирует пользователя, генерирует и возвращает токен доступа.
При неудачной авторизации возвращается null. Токен - текстовая строка, генерируемая методом авторизации
(32 символа, которые включают цифры и буквы англ. алфавита). Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token
Метод получения корзины принимает токен и возвращает список товаров (содержимое переменной корзины).
Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации.
Переменные логин, пароль и корзина проинициализированы заранее и неизменяемы.
 */

fun main() {

    val shop = Shop()

    println(shop.authorization())  // получаем токен

    shop.getBasket(shop.authorization())   // по токену получаем содержимое корзины
}

class Shop() {
    private val login = "zzz"
    private val password = "111"
    private val basket = listOf("ноут", "наушники", "кружка для кофе")


    fun authorization(): String? {
        println("Введите логин")
        val userLogin = readln()
        println("Введите пароль")
        val userPassword = readln()
        if (userLogin == login && userPassword == password) {
            println("верификация пройдена")
            val token = (0..32).map {
                ((0..9) + ('a'..'x') +
                        ('A'..'Z')).random()
            }
            return token.joinToString("")
        } else
            println("Верификация не пройдена")
        return null
    }

    fun getBasket(authorizaton: String?) {
        if (authorizaton != null)
            println("Ваша корзина: ${basket.joinToString(", ")}")
        else
            return println("Список товаров не может быть получен")
    }
}
