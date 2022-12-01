
// open -делает класс открытым для наследования

open class Person(val name: String, val age: Int) {
    fun walk() = println("Walking")
    fun eat() = println("Eating")
    fun sleep() = println("Sleeping")

}