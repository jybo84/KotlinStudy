package Traing

fun main() {
    var book1 = Book(page = 100, title = "Pushkin")
    println(book1)
}

class Book(var title: String, var page: Int) {

    var color: String = " "

    constructor(title: String, page: Int, _color: String) : this(title, page) {

        color = _color
    }

    override fun toString(): String {
        return ("Book $title, $page")
    }
}

/* Иван, в продолжении темы.
Я создал осовной консруктор с 2 параметрами, под него переопределил toString где выводятся эти 2 параметра
Создал дополнительный конструктор там 3 параметра. Но под него я не могу toString 2-й раз переопределить, Идея не дает.
Как быть в такой ситуации.
Чтоб под любой объект, был свой вывод.
Можно конечно вывести по первому контруктору и добавить отдельно параметр, но это уже костыли. (Как мне кажется)
 */