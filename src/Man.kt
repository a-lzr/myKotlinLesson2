open class Man(override var name: String, override var age: Int) : Human {
    override var sex: Sex = Sex.MAN
    var occupation: String? = null

    val sayOfMan = { name: String, age: Int, occupation: String? ->
        if (occupation == null)
            "My name is $name. I'm man. I'm $age years old."
        else
            "My name is $name. I'm man. I'm $age years old. I'm an $occupation."
    }

    override fun say() {
        println(sayOfMan(name, age, occupation))
    }

    override fun eat() {
        println("I'm eat meat")
    }

    override fun work() {
        println("I'm an $occupation")
    }
}