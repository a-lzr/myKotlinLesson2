enum class Sex {
    MAN, WOMAN
}

interface Human {
    var name: String
    var age: Int
    var sex: Sex

    fun say()
    fun eat()
    fun work()
}