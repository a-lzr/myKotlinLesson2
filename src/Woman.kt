open class Woman(override var name: String, override var age: Int) : Human {
    override var sex: Sex = Sex.WOMAN
    var hobby: String? = null

    val sayOfWoman = { name: String, age: Int, hobby: String? ->
        if (hobby == null)
            "My name is $name. I'm man. I'm $age years old."
        else
            "My name is $name. I'm man. I'm $age years old. I like to do $hobby."
    }

    override fun say() {
        println(sayOfWoman(name, age, hobby))
    }

    override fun eat() {
        println("I'm eat fruit")
    }

    override fun work() {
        println("I like to do $hobby")
    }
}
