package Lesson_14

/*
Задача 2 к Уроку 14

Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.
Каждый тип корабля обладает уникальным способом погрузки:
- лайнер выдвигает горизонтальный трап со шкафута;
- грузовой корабль активирует погрузочный кран;
- ледокол открывает ворота со стороны кормы.
Реализуй методы погрузки, специфичные для каждого вида корабля.
Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.
 */

fun main() {
    val ship1 = CraftLiner(100, 100, "Лайнер")
    ship1.infoCraft()

    val ship2 = CraftCargo(50, 50, "Грзовой корабль")
    ship2.infoCraft()

    val ship3 = CraftIceBreaker(30, 15, "Ледокол")
    ship3.infoCraft()
}

open class CraftLiner(
    open val speed: Int,
    open val capacity: Int,
    open val typeOfCraft: String,
) {
    open fun haveSkill() {
        println("Я умею ходить по воде со скоростью $speed км/ч и перевезти $capacity человек")
    }

    open fun loadCraft() {
        println("Я имею возможность грузиться выдвигая горизонтальный трап со шкафута")
    }

    open fun getSpecification() {
        println("Я $typeOfCraft моя скорость $speed, могу перевезти $capacity людей")

    }

    fun infoCraft() {
        getSpecification()
        haveSkill()
        loadCraft()
        println("_______________________")
    }
}

class CraftCargo(speed: Int, capacity: Int, typeOfCraft: String) : CraftLiner(speed, capacity, typeOfCraft) {
    override fun haveSkill() {
        println("Я умею ходить по воде со скоростью $speed км/ч и перевезти $capacity тонн груза")
    }

    override fun loadCraft() {
        println("Я имею возможность грузиться активируя погрузочный кран")
    }

    override fun getSpecification() {
        println("Я $typeOfCraft моя скорость $speed, могу перевезти $capacity тонн груза")
    }
}

class CraftIceBreaker(speed: Int, capacity: Int, typeOfCraft: String) : CraftLiner(speed, capacity, typeOfCraft) {
    override fun haveSkill() {
        println("Я хожу по воде всего $speed км/ч, могу перевезти всего $capacity человек зато я умею ломать лед")
    }

    override fun loadCraft() {
        println("Я имею возможность грузиться открывая ворота со стороны кормы")
    }

    override fun getSpecification() {
        println("Я $typeOfCraft моя скорость $speed, могу перевезти только команду корабля из $capacity человек ")
    }
}

