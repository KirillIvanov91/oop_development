import kotlin.random.Random

open class Developer(
    name: String = "Developer",
    age: Int = 17,
    protected val experience: Int = 0

) : Person(name, age) {
       open val paradigm = "OOP"


   open fun writeCod() = println("Программист пишет код")
       open fun getLvl() = when (experience) {
            0 -> "Loser"
            in 1..2 -> "Junior"
            in 3..4 -> "Middle"
            in 5..6 -> "Senior"

            else -> "Leader"

        }

        protected  open fun getCoffeeBreak() = Random.nextBoolean()



}