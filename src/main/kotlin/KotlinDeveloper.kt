class KotlinDeveloper : Developer {

    constructor(name: String, age: Int) : super(name, age)
        // значение experience будет браться по умолчание из класса Developer

    constructor(name: String, age: Int, experience: Int) : super(name, age, experience)
    // заведём еще один конструктор чтобы не сломать функцию базового класса Developer.getLvl(experience)
    /*
    если мы явно будем передавать значение experience в конструктор,
    то значение experience будет передаваться в конструктор родительского класса
    */


    //Переопределение функции родительского класса в дочернем классе
    //В родительском классе данная функция должна быть с модификатором open
    override fun writeCod() {
        println("Я программирую на Kotlin")
        super.getCoffeeBreak()
    }

    override fun getCoffeeBreak() = true





 }
