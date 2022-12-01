class CppDeveloper:Developer {
    constructor(name:String,age:Int,):super(name,age)
    constructor(name: String,age: Int,experience:Int):super(name,age,experience)

    override fun writeCod() {
        super.writeCod()
        println("C++  code")
    }

    override fun getLvl()= when (experience) {
            0 -> "Loser"
            in 2..4 -> "Junior"
            in 5..7 -> "Middle"
            in 8..10 -> "Senior"

            else -> "Leader"

        }

}
