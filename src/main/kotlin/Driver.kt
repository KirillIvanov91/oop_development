/*
 Наследуем класс Driver от класса Person,
 ':' нужно ставить или после имени класса или после параметров " Driver (...,...,...):Person
 */

// не указывал val или var в параметрах конструктора Driver, так как они уже есть в классе Person и класс Driver
// при наследовании автоматически получит все параметры класса Person, со всеми геттерами и сеттерами


class Driver(
    nameArg: String,
    ageArg: Int,
    val experience: Int
) : Person(nameArg, ageArg) {
    fun drive() = println("drive")
}