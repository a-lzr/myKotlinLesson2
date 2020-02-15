open class Father(name: String, age: Int) : Man(name, age) {
    var hasFamily: Boolean? = null

    constructor(name: String, age: Int, occupation: String) : this(name, age) {
        this.occupation = occupation
    }

    constructor(name: String, age: Int, occupation: String, hasFamily: Boolean) : this(name, age, occupation) {
        this.hasFamily = hasFamily
    }

    val sayOfFather = { hasFamily: Boolean? ->
        if (hasFamily == true)
            " I have a family."
        else if (hasFamily == false)
            " I have not a family."
        else
            ""
    }

    override fun say() {
        println(sayOfMan(name, age, occupation) + " I'm father." + sayOfFather(hasFamily))
    }
}