open class Mother(name: String, age: Int) : Woman(name, age) {
    var countСhildrens: Int? = null

    constructor(name: String, age: Int, hobby: String) : this(name, age) {
        this.hobby = hobby
    }

    constructor(name: String, age: Int, hobby: String, countСhildrens: Int?) : this(name, age, hobby) {
        this.countСhildrens = countСhildrens
    }

    val sayOfMother = { countСhildrens: Int? ->
        if (countСhildrens == null)
            ""
        else
            "I have $countСhildrens childrens."
    }

    override fun say() {
        println(sayOfWoman(name, age, hobby) + " I'm mother." + sayOfMother(countСhildrens))
    }
}