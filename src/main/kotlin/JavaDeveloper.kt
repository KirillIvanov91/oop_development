class JavaDeveloper : Developer {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int,experience:Int):super(name,age,experience)

    override fun writeCod() {
        println("Я  программирую на Java")
    }
}