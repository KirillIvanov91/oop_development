fun main() {

    val kotlinDeveloper = KotlinDeveloper(name ="Kirill",age = 32, experience =  2)
    val javaDeveloper = JavaDeveloper("Miguel", 25)
    val cppDeveloper = CppDeveloper(    name = "Kristina", age = 21, experience = 3)
    val superDeveloper = Developer(name = "Developer", age = 100, experience = 100)
    val scalaDeveloper = ScalaDeveloper(name = "scalaDeveloper", age = 20, experience = 10)
val developer = Developer()
    println()
    kotlinDeveloper.writeCod()

    println("Мой Lvl - ${kotlinDeveloper.getLvl()}")

    println()
    javaDeveloper.writeCod()

    println("Мой Lvl - ${javaDeveloper.getLvl()}")

    println()
    cppDeveloper.writeCod()

    println("Мой Lvl - ${cppDeveloper.getLvl()}")

    println()
    superDeveloper.writeCod()



    println("Lvl - ${superDeveloper.getLvl()}")



    println()
    println("scalaDeveloper - ${scalaDeveloper.paradigm}")
    println("javaDeveloper - ${javaDeveloper.paradigm} ")

    println(" определен девелопер ${developer.getLvl()}, ${developer.paradigm}")

}